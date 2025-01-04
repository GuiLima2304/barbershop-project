package com.myproject.barbershop.scheduling.controller;

import com.myproject.barbershop.scheduling.dto.NewScheduleDTO;
import com.myproject.barbershop.scheduling.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/new")
    public ResponseEntity newSchedule(@RequestBody NewScheduleDTO bodyRequest) {
        return this.scheduleService.newSchedule(bodyRequest);
    }
}
