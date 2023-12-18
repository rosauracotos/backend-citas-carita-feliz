package com.example.citascaritafeliz.dtos;


public class TurnoDto {

    private Long id;
    private String horaCita;

    private String medicoNombre;
    private String estadoCita;

    private Long medicoId;

    public TurnoDto() {
    }

    public TurnoDto(String horaCita,  Long medicoId) {
        this.horaCita = horaCita;
        this.medicoId = medicoId;
    }

    public TurnoDto(Long id, String horaCita, String medicoNombre,  Long medicoId, String estadoCita) {
        this.id = id;
        this.horaCita = horaCita;
        this.medicoId = medicoId;
        this.medicoNombre = medicoNombre;
        this.estadoCita = estadoCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getMedicoNombre() {
        return medicoNombre;
    }

    public void setMedicoNombre(String medicoNombre) {
        this.medicoNombre = medicoNombre;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
