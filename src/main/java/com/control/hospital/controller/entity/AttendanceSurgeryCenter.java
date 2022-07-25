package com.control.hospital.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "attendance_surgery_center")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceSurgeryCenter {
    @Id
    @Column(
            updatable = false,
            unique = true,
            nullable = false
    )
    private String id;

    @Column(
            nullable = false,
            name = "amount_spent"
    )
    private Double amountSpent;

    @Column(
            nullable = false,
            name = "date_time_entry"
    )
    private LocalDateTime dateTimeEntry;

    @Column(
            nullable = false,
            name = "date_time_exit"
    )
    private LocalDateTime dateTimeExit;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    Attendance attendance;

    @ManyToOne
    @JoinColumn(name = "surgery_center_id")
    SurgeryCenter surgeryCenter;
}
