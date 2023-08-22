package com.example.citascaritafeliz.controller;

import com.example.citascaritafeliz.model.Paciente;
import com.example.citascaritafeliz.service.PacienteService;
import com.example.citascaritafeliz.util.RespuestaControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/guardar")
    public ResponseEntity<?> guardar (@RequestBody Paciente paciente){
        try {
            RespuestaControlador rc = pacienteService.guardar(paciente);
            return ResponseEntity.ok(rc);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

}
