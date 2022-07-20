package com.control.hospital.controller.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum TypeSurgeryCenter {
    SURGICAL("surgical"), OBSTETRIC("obstetric"), WAITING_ROOM("waitingRoom");
    private String value;
}
