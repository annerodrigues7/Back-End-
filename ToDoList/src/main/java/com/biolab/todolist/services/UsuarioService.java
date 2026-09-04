package com.biolab.todolist.services;

import com.biolab.todolist.DTO.UsuarioDTO;
import com.biolab.todolist.entities.Usuario;
import com.biolab.todolist.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
  public String criar(UsuarioDTO u) {
      Usuario usuario = new Usuario();
      usuario.setEmail(u.getEmail());
      usuario.setNome(u.getNome());
      usuario.setSenha(u.getSenha());

      usuarioRepository.save(usuario);
      return "Usuario criado com sucesso!!";
  }
}
