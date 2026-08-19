package com.example.canil.service;

import com.example.canil.DTO.CachorroDTO;
import com.example.canil.entities.Cachorro;
import com.example.canil.repositories.CachorroRepository;

import org.springframework.stereotype.Service;

import java.util.List;

    // O Service realiza a operação e utiliza o Repository
    // para acessar o banco de dados

@Service
public class CachorroService {

    private final CachorroRepository repository;

    public CachorroService(CachorroRepository repository) {
        this.repository = repository;
    }


    // O 'Cadastrar' recebe os dados do DTO, cria um cachorro e salva esse cachorro no banco
    public Cachorro cadastrar(CachorroDTO dto) {

        Cachorro cachorro = new Cachorro();

        cachorro.setNome(dto.getNome());
        cachorro.setRaca(dto.getRaca());
        cachorro.setIdade(dto.getIdade());
        cachorro.setCor(dto.getCor());

        return repository.save(cachorro);
    }

    //Busca todos os cachorros cadastrados no banco de dados
    public List<Cachorro> listar() {

        return repository.findAll();
    }

    //Procura um cachorro utilizando o ID informado que for informado
    public Cachorro buscar(Long id) {

        return repository.findById(id).orElse(null);
    }


    // Primeiro procura o cachorro pelo ID, e se encontrar, altera os dados e salva
    // novamente no banco de dados
    public Cachorro atualizar(Long id, CachorroDTO dto) {

        Cachorro cachorro = repository.findById(id).orElse(null);

        if (cachorro != null) {

            cachorro.setNome(dto.getNome());
            cachorro.setRaca(dto.getRaca());
            cachorro.setIdade(dto.getIdade());
            cachorro.setCor(dto.getCor());

            return repository.save(cachorro);
        }

        return null;
    }

    // Remove o cachorro do banco de dados utilizando o ID

    public void excluir(Long id) {

        repository.deleteById(id);
    }
}