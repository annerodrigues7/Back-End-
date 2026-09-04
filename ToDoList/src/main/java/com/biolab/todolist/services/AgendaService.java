package com.biolab.todolist.services;

import com.biolab.todolist.DTO.AgendaRequest;
import com.biolab.todolist.entities.Agenda;
import com.biolab.todolist.repositories.AgendaRepository;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {

    private final AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public String criar(AgendaRequest a) {

        Agenda agenda = new Agenda();

        agenda.setTarefa(a.getTarefa());
        agenda.setDescricao(a.getDescricao());

        agendaRepository.save(agenda);

        return "Agenda criada com sucesso!";
    }
}
