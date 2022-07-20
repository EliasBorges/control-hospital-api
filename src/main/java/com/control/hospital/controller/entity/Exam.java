package com.control.hospital.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    @Id
    @Column(
            updatable = false,
            unique = true,
            nullable = false
    )
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(
            nullable = false,
            name = "medical_license"
    )
    private String medicalLicense;

    @Column(nullable = false)
    private String specialty;
}
