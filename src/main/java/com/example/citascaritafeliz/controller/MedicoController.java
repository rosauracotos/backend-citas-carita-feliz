package com.example.citascaritafeliz.controller;

import com.example.citascaritafeliz.model.Medico;
import com.example.citascaritafeliz.service.MedicoService;
import com.example.citascaritafeliz.util.RespuestaControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping("/listarTodos")
    public ResponseEntity<?> listar(){
        try {
            List<Medico> lista = medicoService.listarTodos();
            return ResponseEntity.ok(lista);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }
}
