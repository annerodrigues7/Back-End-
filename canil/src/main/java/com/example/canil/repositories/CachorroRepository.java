package com.example.canil.repositories;

import com.example.canil.entities.Cachorro;
import org.springframework.data.jpa.repository.JpaRepository;


    // O Repository é responsável por fazer a comunicação com o banco de dados
    // Já o  JpaRepository possui vários métodos prontos para realizar as operações do CRUD
public interface CachorroRepository extends JpaRepository<Cachorro, Long> {

}