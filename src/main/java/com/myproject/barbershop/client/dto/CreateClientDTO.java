package com.myproject.barbershop.client.dto;

import com.myproject.barbershop.people.model.CategoryPeople;

public record CreateClientDTO(String name, String cpf, CategoryPeople categoryPeople, String address) {
}
