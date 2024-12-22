package com.myproject.barbershop.employee.dto;

import com.myproject.barbershop.employee.model.Employee;
import com.myproject.barbershop.people.model.CategoryPeople;

public record EmployeeDTO(Long id, String name, String cpf, CategoryPeople categoryPeople, Float salary) {

    public EmployeeDTO(Employee employee){
        this(employee.getId(), employee.getName(), employee.getCpf(), employee.getCategoryPeople(), employee.getSalary());
    }
}
