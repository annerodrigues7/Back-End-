package Doceria;

public class MainDoceria {
    static void main(){
        Doce torta = new Torta();
        Doce bolo = new Bolo();

        torta.setNome("torta de banoffee");
        torta.setCor("marrom com branco");
        torta.setPeso("500 gramas");

        bolo.setNome("bolo de cenoura");
        bolo.setCor("laranja");
        bolo.setCor("1 kg");

        IO.println("bolo com cobertura de " + bolo.cobertura() + " " + " e massa de " + bolo.massa());
        IO.println("torta cobertura de " + torta.cobertura() + " " + "e massa de " + torta.massa());
    }
}
