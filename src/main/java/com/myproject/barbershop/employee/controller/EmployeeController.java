package com.myproject.barbershop.employee.controller;


import com.myproject.barbershop.employee.dto.CreateEmployeeDTO;
import com.myproject.barbershop.employee.dto.EmployeeDTO;
import com.myproject.barbershop.employee.service.EmployeeService;
import com.myproject.barbershop.people.dto.CreatePeopleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeDTO>> getAllPeople() {
        List<EmployeeDTO> peopleDTO = this.employeeService.getAllEmployees();
        return ResponseEntity.ok(peopleDTO);
    }

    @PostMapping("/create")
    public ResponseEntity createPeople(@RequestBody CreateEmployeeDTO bodyRequest) {
        return this.employeeService.createEmployee(bodyRequest);
    }
}
