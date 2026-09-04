package com.biolab.todolist.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AgendaDTO {
    private Long id;
    private String tarefa;
    private String descricao;

public AgendaDTO(Long id, String tarefa) {
    this.id = id;
    this.tarefa = tarefa;
}
}
