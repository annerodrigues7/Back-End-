package com.biolab.todolist.repositories;

import com.biolab.todolist.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
