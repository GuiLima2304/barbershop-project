package com.myproject.barbershop.scheduling.model;

import com.myproject.barbershop.client.model.Client;
import com.myproject.barbershop.employee.model.Employee;
import com.myproject.barbershop.scheduling.dto.NewScheduleDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    private LocalDate datetime;
    private List<TypeServiceEnum> typeServiceEnum;

    public Schedule(NewScheduleDTO newScheduleDTO, Optional<Employee> employee, Optional<Client> client) {
        this.setClient(client.get());
        this.setEmployee(employee.get());
        this.setDatetime(newScheduleDTO.datetime());
        this.setTypeServiceEnum(newScheduleDTO.typeServiceEnum());
    }
}
