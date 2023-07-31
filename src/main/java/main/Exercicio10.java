package main;

import java.util.Scanner;

public class Exercicio10 {

//    ler 4 notas do aluno  e dividir por 4
//    >=7 Aprovado
//    >=5  e < 7 De recuperação
//    < 5 reprovado
//    github tarefa-controle-de-fluxo modulo 10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media < 5) {
            System.out.println("Aluno reprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno de recuperação");
        } else if (media >= 7) {
            System.out.println("Aluno aprovado");
        }
    }
}
