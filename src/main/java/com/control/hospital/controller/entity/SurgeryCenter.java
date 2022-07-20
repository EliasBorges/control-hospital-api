package com.control.hospital.controller.entity;

import com.control.hospital.controller.enums.TypeSurgeryCenter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "surgery_center")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SurgeryCenter {
    @Id
    @Column(
            updatable = false,
            unique = true,
            nullable = false
    )
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(
            nullable = false,
            name = "type_surgery_center"
    )
    private TypeSurgeryCenter typeSurgeryCenter;

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
