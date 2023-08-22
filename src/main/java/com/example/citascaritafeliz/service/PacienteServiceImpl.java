package com.example.citascaritafeliz.service;

import com.example.citascaritafeliz.model.Paciente;
import com.example.citascaritafeliz.repository.PacienteRepository;
import com.example.citascaritafeliz.util.RespuestaControlador;
import com.example.citascaritafeliz.util.RespuestaControladorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    RespuestaControladorServicio respuestaControladorServicio;

    @Override
    public RespuestaControlador guardar(Paciente paciente) {
        RespuestaControlador respuestaControlador;
        pacienteRepository.save(paciente);
        respuestaControlador = respuestaControladorServicio.obtenerRespuestaDeExitoCrear("Medico");
        respuestaControlador.setExtraInfo(paciente);
        return respuestaControlador;
    }
}
