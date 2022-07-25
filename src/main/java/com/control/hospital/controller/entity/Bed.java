package com.control.hospital.controller.entity;

import com.control.hospital.controller.enums.TypeBed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.EnumType.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bed {
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
    private String name;

    @Enumerated(STRING)
    @Column(
            nullable = false,
            name = "type_bed"
    )
    private TypeBed typeBed;

    @Column(
            nullable = false,
            name = "value_daily"
    )
    private Double valueDaily;

    @Column(
            nullable = false,
            name = "quantity_total"
    )
    private Integer quantityTotal;

    @Column(
            nullable = false,
            name = "quantity_occupied"
    )
    private Integer quantityOccupied;
}
