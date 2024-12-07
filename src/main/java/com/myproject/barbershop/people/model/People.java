package com.myproject.barbershop.people.model;

import com.myproject.barbershop.people.model.CategoryPeople;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "people")
public abstract class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String CPF;
    private CategoryPeople categoryPeople;

}
