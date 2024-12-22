package com.myproject.barbershop.employee.model;

import com.myproject.barbershop.employee.dto.CreateEmployeeDTO;
import com.myproject.barbershop.people.model.People;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee extends People {

    private Float salary;

    public Employee(CreateEmployeeDTO createEmployeeDTO) {
        this.setName(createEmployeeDTO.name());
        this.setSalary(createEmployeeDTO.salary());
        this.setCpf(createEmployeeDTO.cpf());
        this.setCategoryPeople(createEmployeeDTO.categoryPeople());
    }
}
