package com.biolab.copa.controllers;

import com.biolab.copa.entities.Selecao;
import com.biolab.copa.repositories.SelecaoRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelecaoControllers {

    private final SelecaoRepository selecaoRepository;

    public SelecaoControllers(SelecaoRepository selecaoRepository) {
        this.selecaoRepository = selecaoRepository;
    }

    @PostMapping
    public String criarSelecao(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(),selecao.getUniforme(),selecao.getMascote());
        selecaoRepository.save(s);
        return "Salvo com sucesso!!";
    }
    @PostMapping(value = "/teste")
    public Selecao criarSelecao1(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(),selecao.getUniforme(),selecao.getMascote());
        selecaoRepository.save(s);
        return s ;
    }

    @GetMapping
    public List<Selecao> mostrarUsuario() {
        List<Selecao> listarSelecao = selecaoRepository.findAll();
        return listarSelecao;
    }
}
