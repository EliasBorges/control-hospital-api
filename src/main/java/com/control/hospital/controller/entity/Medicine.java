package com.control.hospital.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {
    @Id
    @Column(
            updatable = false,
            unique = true,
            nullable = false
    )
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double value;

    @ManyToMany(mappedBy = "medicines")
    private List<Attendance> attendances;
}
