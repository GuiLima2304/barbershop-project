package com.myproject.barbershop.scheduling.model;

import com.myproject.barbershop.people.model.Client;
import com.myproject.barbershop.employee.model.Employee;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "Scheduling")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Employee employee;

    @OneToOne
    private Client client;
    private Date dataTime;
    private Float price;
    private CategoryService categoryService;
}



