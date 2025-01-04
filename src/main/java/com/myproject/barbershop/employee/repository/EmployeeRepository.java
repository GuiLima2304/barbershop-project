package com.myproject.barbershop.employee.repository;

import com.myproject.barbershop.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    boolean existsByCpf(String cpf);
    Optional<Employee> findById(Long id);
}
