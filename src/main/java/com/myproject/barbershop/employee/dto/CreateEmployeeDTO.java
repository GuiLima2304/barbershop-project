package com.myproject.barbershop.employee.dto;

import com.myproject.barbershop.people.model.CategoryPeople;

public record CreateEmployeeDTO(String name, String cpf, CategoryPeople categoryPeople, Float salary) {


}
