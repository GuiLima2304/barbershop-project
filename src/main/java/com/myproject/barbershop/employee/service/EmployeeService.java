package com.myproject.barbershop.employee.service;

import com.myproject.barbershop.employee.dto.CreateEmployeeDTO;
import com.myproject.barbershop.employee.dto.EmployeeDTO;
import com.myproject.barbershop.employee.model.Employee;
import com.myproject.barbershop.employee.repository.EmployeeRepository;
import com.myproject.barbershop.shared.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<EmployeeDTO> getAllEmployees() {
        return this.employeeRepository.findAll().stream().map(EmployeeDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public ResponseEntity createEmployee(CreateEmployeeDTO requestBody) {
        if(employeeRepository.existsByCpf(requestBody.cpf())) {
            throw new ValidationException("Funcionário ja existente");
        }

        Employee employee = new Employee(requestBody);
        employeeRepository.save(employee);

        return ResponseEntity.noContent().build();
    }
}
