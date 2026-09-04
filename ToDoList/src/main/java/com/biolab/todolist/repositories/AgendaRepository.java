package com.biolab.todolist.repositories;

import com.biolab.todolist.entities.Agenda;
import org.springframework.data.repository.CrudRepository;

public interface AgendaRepository extends CrudRepository<Agenda, Long> {

}
