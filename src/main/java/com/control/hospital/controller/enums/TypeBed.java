package com.control.hospital.controller.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum TypeBed {
    GENERAL_SURGERY("generalSurgery"), PEDIATRIC("pediatric"), NURSERY("nursery"),
    MEDICAL_CLINIC("medicalClinic"), ORTHOPEDIC("orthopedic"), OBSTETRIC("obstetric"),
    UTI("uti"), UTI_NEONATAL("utiNeonatal");

    private String value;
}
