package com.biolab.todolist.DTO;

import jakarta.validation.constraints.NotNull;

public class AgendaResponse {
    private String tarefa;
    private String descricao;
    private String status;


    public AgendaResponse() {
    }
    public AgendaResponse(String tarefa, String descricao, String status) {
        this.tarefa = tarefa;
        this.descricao = descricao;
        this.status = status;
    }
    public String getTarefa() {
        return tarefa;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getStatus() {
        return status;
    }
    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setAgenda(AgendaDTO a) {
        this.tarefa = a.getTarefa();
        this.descricao = a.getDescricao();
    }

}