package com.control.hospital.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum TypeService {
    NORMAL("normal"), URGENCY("urgency");
    private String value;
}
