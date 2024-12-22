package com.myproject.barbershop.client.controller;

import com.myproject.barbershop.client.dto.CreateClientDTO;
import com.myproject.barbershop.client.model.Client;
import com.myproject.barbershop.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> listClient = this.clientService.getAllClients();
        return ResponseEntity.ok(listClient);
    }

    @PostMapping("/create")
    public ResponseEntity createClient(@RequestBody CreateClientDTO createClientDTO) {
        return this.clientService.createClient(createClientDTO);
    }
}
