package com.biolab.todolist.DTO;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuarioDTO {
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank @Email
    @Size(max = 150)
    private String email;
    @NotBlank @Size (min = 6 , max = 20)
    private String senha;

    public UsuarioDTO() {

}
    public UsuarioDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
