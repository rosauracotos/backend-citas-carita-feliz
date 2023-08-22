package com.example.citascaritafeliz.service;

import com.example.citascaritafeliz.model.Medico;
import com.example.citascaritafeliz.repository.MedicoRepository;
import com.example.citascaritafeliz.util.RespuestaControlador;
import com.example.citascaritafeliz.util.RespuestaControladorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService{

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    RespuestaControladorServicio respuestaControladorServicio;

    @Override
    public List<Medico> listarTodos() {
        List<Medico> listaMedicos = medicoRepository.findAll();
        return listaMedicos;
    }
}
