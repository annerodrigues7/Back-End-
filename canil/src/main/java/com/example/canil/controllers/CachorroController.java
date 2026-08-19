package com.example.canil.controllers;

import com.example.canil.entities.Cachorro;
import com.example.canil.repositories.CachorroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    //O Controller é responsável por receber
    //as requisições feitas pelo usuário, e também pelo Postman
@RestController
@RequestMapping("/cachorros")
public class CachorroController {

    private final CachorroRepository repository;

    public CachorroController(CachorroRepository repository) {
        this.repository = repository;
    }

    // O 'Post' recebe os dados enviados pelo usuário
    // e chama o Service para cadastrar o cachorro
    @PostMapping
    public Cachorro cadastrar(@RequestBody Cachorro cachorro) {
        return repository.save(cachorro);
    }

    // O 'List' retorna todos os cachorros que estão cadastrados
    @GetMapping
    public List<Cachorro> listar() {
        return repository.findAll();
    }

    // Recebe o ID  e chama o Service para encontrar o cachorro
    @GetMapping("/{id}")
    public Cachorro buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // Recebe o ID do cachorro e os novos dados,
    // depois chama o Service para realizar as alterações
    @PutMapping("/{id}")
    public Cachorro atualizar(@PathVariable Long id,
                              @RequestBody Cachorro cachorro) {

        Cachorro cachorroExistente = repository.findById(id).orElse(null);

        if (cachorroExistente != null) {

            cachorroExistente.setNome(cachorro.getNome());
            cachorroExistente.setRaca(cachorro.getRaca());
            cachorroExistente.setIdade(cachorro.getIdade());
            cachorroExistente.setCor(cachorro.getCor());

            return repository.save(cachorroExistente);
        }

        return null;
    }

    // Recebe o ID do cachorro e chama o Service
    // para excluir o registro do banco
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}