package com.myproject.barbershop.people.dto;

import com.myproject.barbershop.people.model.CategoryPeople;

public record CreatePeopleDTO(String name, String cpf, CategoryPeople categoryPeople) {
}
