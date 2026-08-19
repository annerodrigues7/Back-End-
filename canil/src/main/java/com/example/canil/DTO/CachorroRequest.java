package com.example.canil.DTO;

    //O 'Request' é usado para receber os dados enviados pelo usuário
public class CachorroRequest {

        private String nome;
        private String raca;
        private Integer idade;

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

