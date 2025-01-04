package com.myproject.barbershop.scheduling.repository;

import com.myproject.barbershop.scheduling.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
