package com.control.hospital.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Genre {
    MASCULINE("masculine"), FEMALE("female");
    private String value;
}
