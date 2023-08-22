package com.example.citascaritafeliz.repository;

import com.example.citascaritafeliz.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
