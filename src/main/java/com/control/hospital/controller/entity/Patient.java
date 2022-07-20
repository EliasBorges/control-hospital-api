package com.control.hospital.controller.entity;

import com.control.hospital.controller.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
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
            name = "registration_number"
    )
    private Integer registrationNumber;

    @Column(
            nullable = false,
            name = "document_number"
    )
    private String documentNumber;

    @Column(
            nullable = false,
            name = "monther_name"
    )
    private String montherName;

    @Column(
            nullable = false,
            name = "birth_date"
    )
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre genre;
}
