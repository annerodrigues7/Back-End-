package com.biolab.todolist.controllers;

import com.biolab.todolist.DTO.AgendaRequest;
import com.biolab.todolist.services.AgendaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
    private final AgendaService agendaService;
        public AgendaController(AgendaService agendaService) {
            this.agendaService = agendaService;
    }

    @PostMapping
    public ResponseEntity<?> criarTarefa(
            @Valid @RequestBody AgendaRequest a) {

        return ResponseEntity.ok(agendaService.criar(a));
    }


    @GetMapping
    public ResponseEntity<?> listarTarefas() { return ResponseEntity.ok("Listado com sucesso"); }

    @PutMapping
    public ResponseEntity<?> atualizarTarefa() { return ResponseEntity.ok("Atualizado com sucesso"); }

    @DeleteMapping
    public ResponseEntity<?> deletarTarefa() { return ResponseEntity.ok("Deletado com sucesso"); }



}
