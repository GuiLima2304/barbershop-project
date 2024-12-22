package com.myproject.barbershop.people.repository;

import com.myproject.barbershop.people.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {
    boolean existsByCpf(String cpf);
}
