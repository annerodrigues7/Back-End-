package Doceria;

public class Doce {
    private String nome;
    private String cor;
    private String peso;

    public Doce(){

    }

    public Doce(String nome, String cor, String peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String cobertura(){
        return "cobertura";
    }
    public String massa(){
        return "massa";
    }
}
