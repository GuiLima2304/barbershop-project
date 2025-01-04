package com.myproject.barbershop.scheduling.service;

import com.myproject.barbershop.client.model.Client;
import com.myproject.barbershop.client.repository.ClientRepository;
import com.myproject.barbershop.employee.model.Employee;
import com.myproject.barbershop.employee.repository.EmployeeRepository;
import com.myproject.barbershop.scheduling.dto.NewScheduleDTO;
import com.myproject.barbershop.scheduling.model.Schedule;
import com.myproject.barbershop.scheduling.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ClientRepository clientRepository;

    public ResponseEntity newSchedule(NewScheduleDTO bodyRequest) {

        Optional<Employee> employee = employeeRepository.findById(bodyRequest.employee());

        Optional<Client> client = clientRepository.findById(bodyRequest.client());

        Schedule schedule = new Schedule(bodyRequest, employee, client);
        scheduleRepository.save(schedule);

        return ResponseEntity.noContent().build();
    }
}
