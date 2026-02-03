package aula2;

import java.util.Scanner;

public class EntradaDeDados {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite o seu nome: ");
        String nome = sc.next();

        IO.println(nome);

        Scanner id = new Scanner(System.in);
        IO.println("Digite o sua idade:: ");
        int idade = sc.nextInt();

        IO.println(idade);

        Scanner alt = new Scanner(System.in);
        IO.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        IO.println(altura);

        Scanner pes = new Scanner(System.in);
        IO.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        IO.println(peso);

        double imc = peso / (altura * altura);
        IO.println(imc);
    }
}
