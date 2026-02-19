package ex1;

import java.util.Scanner;

public class Principal {
    @Override
    public String toString() {
        return "Principal{}";
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite o nome: ");
        String nome = sc.next();
        IO.println("Digite a idade:");
        int idade = sc.nextInt();
        IO.println("DIgite o sexo: ");
        String sexo = sc.next();
        IO.println("Digite a raça: ");
        String raca = sc.next();

        Cachorro cachorro = new Cachorro(nome, idade, sexo, raca);





    }
}
