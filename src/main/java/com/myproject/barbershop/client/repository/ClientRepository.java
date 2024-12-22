package com.myproject.barbershop.client.repository;

import com.myproject.barbershop.client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
