package com.example.canil.DTO;

    //O 'Response' é usado para devolver os dados do cachorro para o usuário
public class CachorroResponse {

        private Long id;
        private String nome;
        private String raca;
        private Integer idade;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }
    }

