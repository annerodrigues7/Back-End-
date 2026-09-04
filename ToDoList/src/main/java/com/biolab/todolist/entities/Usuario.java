package com.biolab.todolist.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @NotBlank
        private String nome;
        @Column(length = 150)
        private String email;
        @NotBlank @Size(min = 6 , max = 20)
        private String senha;
    }


