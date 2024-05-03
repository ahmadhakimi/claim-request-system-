//AttachmentEntity.java

package com.project.claim.system.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.UUID;

@Entity
@Table(name = "attachment")
@Data


public class AttachmentEntity {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] data;
    private String type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "claimId")
    private ClaimEntity claim;
}
