package com.control.hospital.controller.entity;

import com.control.hospital.controller.enums.TypeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.EnumType.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {
    @Id
    @Column(
            updatable = false,
            unique = true,
            nullable = false
    )
    private String id;

    @Column(
            nullable = false,
            name = "service_number"
    )
    private Integer serviceNumber;

    @Column(
            nullable = false,
            name = "punctual_number"
    )
    private Integer punctualNumber;

    @OneToOne(cascade = ALL)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctor doctorId;

    @OneToOne(cascade = ALL)
    @JoinColumn(name = "bed_id", referencedColumnName = "id")
    private Bed bedId;

    @Column(nullable = false)
    private Double value;

    @Column(nullable = false)
    private String note;

    @Column(
            nullable = false,
            name = "is_plan"
    )
    private Boolean isPlan;

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

    @Enumerated(STRING)
    @Column(
            nullable = false,
            name = "type_service"
    )
    private TypeService typeService;

    @OneToMany(mappedBy = "attendance")
    private List<AttendanceSurgeryCenter> registrations;

    @ManyToMany
    @JoinTable(
            name = "exam_attendance",
            joinColumns = @JoinColumn(name = "attendance_id"),
            inverseJoinColumns = @JoinColumn(name = "exam_id"))
    private List<Exam> exams;

    @ManyToMany
    @JoinTable(
            name = "medicine_attendance",
            joinColumns = @JoinColumn(name = "attendance_id"),
            inverseJoinColumns = @JoinColumn(name = "medicine_id"))
    private List<Medicine> medicines;

    @ManyToMany
    @JoinTable(
            name = "patient_attendance",
            joinColumns = @JoinColumn(name = "attendance_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private List<Patient> patients;
}
