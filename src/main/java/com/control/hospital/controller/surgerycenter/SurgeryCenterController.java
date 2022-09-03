package com.control.hospital.controller.surgerycenter;

import com.control.hospital.service.ISurgeryCenterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/surgerycenters")
public class SurgeryCenterController {
    private final ISurgeryCenterService service;
}
