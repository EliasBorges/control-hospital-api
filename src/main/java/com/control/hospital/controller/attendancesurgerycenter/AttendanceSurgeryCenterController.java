package com.control.hospital.controller.attendancesurgerycenter;

import com.control.hospital.service.IAttendanceSurgeryCenterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/managements")
public class AttendanceSurgeryCenterController {
    private final IAttendanceSurgeryCenterService service;
}
