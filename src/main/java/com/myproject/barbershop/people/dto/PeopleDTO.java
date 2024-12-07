package com.myproject.barbershop.people.dto;

import com.myproject.barbershop.people.model.CategoryPeople;
import com.myproject.barbershop.people.model.People;

public record PeopleDTO(Long id, String name, String cpf, CategoryPeople categoryPeople) {

    public PeopleDTO(People people) {
        this(people.getId(), people.getName(), people.getCPF(), people.getCategoryPeople());
    }
}
