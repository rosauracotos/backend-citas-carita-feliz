package com.example.citascaritafeliz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@Entity
@ToString
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "nombrecompleto")
    private String nombrecompleto;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name = "dni")
    private String dni;

    public Medico(Integer id, String nombrecompleto, String especialidad, String dni) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.especialidad = especialidad;
        this.dni = dni;
    }
}
