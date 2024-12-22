package com.myproject.barbershop.client.service;

import com.myproject.barbershop.client.dto.CreateClientDTO;
import com.myproject.barbershop.client.model.Client;
import com.myproject.barbershop.client.repository.ClientRepository;
import com.myproject.barbershop.people.repository.PeopleRepository;
import com.myproject.barbershop.shared.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PeopleRepository peopleRepository;

    public List<Client> getAllClients() {
        return this.clientRepository.findAll().stream().collect(Collectors.toList());
    }

    public ResponseEntity createClient(CreateClientDTO newClient) {

        if(peopleRepository.existsByCpf(newClient.cpf())) {
            throw new ValidationException("Cliente já tem cadastro!");
        }

        Client client = new Client(newClient);
        clientRepository.save(client);

        return ResponseEntity.status(201).build();
    }
}
