package com.biolab.todolist.controllers;

import com.biolab.todolist.DTO.UsuarioDTO;
import com.biolab.todolist.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) { this.usuarioService = usuarioService; }
    @PostMapping
    public String criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.criar(usuarioDTO);
    }
    
    @GetMapping
    public String listarUsuario() { return "Listado com sucesso"; }

    @PutMapping
    public String atualizarUsuario() { return "Atualizado com sucesso"; }

    @DeleteMapping
    public String deletarUsuario() { return "Deletado com sucesso"; }
}
