package com.control.hospital.entity;

import com.control.hospital.enums.TypeSurgeryCenter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.EnumType.*;

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

    @Enumerated(STRING)
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

    @OneToMany(mappedBy = "surgeryCenter")
    private List<AttendanceSurgeryCenter> registrations;
}
