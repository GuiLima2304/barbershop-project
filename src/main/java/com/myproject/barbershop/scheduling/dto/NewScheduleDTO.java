package com.myproject.barbershop.scheduling.dto;

import com.myproject.barbershop.client.model.Client;
import com.myproject.barbershop.employee.model.Employee;
import com.myproject.barbershop.scheduling.model.TypeServiceEnum;

import java.time.LocalDate;
import java.util.List;

public record NewScheduleDTO(Long client, Long employee, LocalDate datetime, List<TypeServiceEnum> typeServiceEnum) {
}
