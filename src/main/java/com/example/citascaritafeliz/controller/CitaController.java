package com.example.citascaritafeliz.controller;

import com.example.citascaritafeliz.dtos.TurnoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @GetMapping("listarTurnosDeMedico/{medicoId}")
    public List<TurnoDto> listarTurnosDeMedico(@PathVariable("medicoId") Long medicoId){

        List<TurnoDto> turnosMedico1 = Arrays.asList(
                new TurnoDto("08:00-08:20", 1L),
                new TurnoDto("08:20-08:40", 1L),
                new TurnoDto("08:40-09:00", 1L),
                new TurnoDto("09:00-09:20", 1L)
        );

        List<TurnoDto> turnosMedico2 = Arrays.asList(
                new TurnoDto("14:00-14:20", 2L),
                new TurnoDto("14:20-14:40", 2L),
                new TurnoDto("14:40-15:00", 2L),
                new TurnoDto("15:00-15:20", 2L),
                new TurnoDto("15:20-15:40", 2L)
        );

        return medicoId == 1 ? turnosMedico1: turnosMedico2;
    }

    @GetMapping("listarMisCitas/{usuarioId}")
    public List<TurnoDto> listarMisCitas(@PathVariable("usuarioId") Long medicoId){
        List<TurnoDto> turnosMedico1 = Arrays.asList(
                new TurnoDto(1L,"28/12/2023 08:00","Litter Franco Palacios", 1L, "Separada"),
                new TurnoDto(2L, "01/12/2023 14:00", "Luna Palacios", 1L, "Atendida"),
                new TurnoDto(3L,"28/09/2023 08:00","Hector Zapata", 1L, "Atendida"),
                new TurnoDto(4L,"01/03/2023 18:00","Hector Zapata", 1L, "Atendida")
        );


        return turnosMedico1;
    }
}
