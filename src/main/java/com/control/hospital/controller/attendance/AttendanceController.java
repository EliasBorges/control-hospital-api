package com.control.hospital.controller.attendance;

import com.control.hospital.service.IAttendanceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/attendances")
public class AttendanceController {
    private final IAttendanceService service;
}
