package com.myproject.barbershop.people.controller;

import com.myproject.barbershop.people.dto.PeopleDTO;
import com.myproject.barbershop.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping
    public ResponseEntity<List<PeopleDTO>> getAllPeople() {
        List<PeopleDTO> peopleDTO = this.peopleService.getAllPeople();
        return ResponseEntity.ok(peopleDTO);
    }

}
