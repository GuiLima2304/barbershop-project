package com.myproject.barbershop.people.service;

import com.myproject.barbershop.people.dto.CreatePeopleDTO;
import com.myproject.barbershop.people.dto.PeopleDTO;
import com.myproject.barbershop.people.model.People;
import com.myproject.barbershop.people.repository.PeopleRepository;
import com.myproject.barbershop.shared.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;
    public List<PeopleDTO> getAllPeople() {
        return this.peopleRepository.findAll().stream().map(PeopleDTO::new).collect(Collectors.toList());
    }
}
