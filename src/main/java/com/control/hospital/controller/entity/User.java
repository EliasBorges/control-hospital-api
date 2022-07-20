package com.control.hospital.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
public class User {
    @Id
    @Column(
            updatable = false,
            unique = true,
            nullable = false
    )
    private String id;

    @Column(
            unique = true,
            nullable = false
    )
    private String username;

    @Column(
            nullable = false,
            length = 100
    )
    private String password;

    @Column(
            nullable = false,
            name = "created_at"
    )
    private LocalDateTime createdAt;

    @Column(
            nullable = false,
            name = "update_at"
    )
    private LocalDateTime updatedAt;
}
