package com.myproject.barbershop.client.model;

import com.myproject.barbershop.client.dto.CreateClientDTO;
import com.myproject.barbershop.people.model.People;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client extends People {

    private String address;

    public Client(CreateClientDTO createClientDTO) {
        this.setName(createClientDTO.name());
        this.setAddress(createClientDTO.address());
        this.setCategoryPeople(createClientDTO.categoryPeople());
        this.setCpf(createClientDTO.cpf());
    }
}
