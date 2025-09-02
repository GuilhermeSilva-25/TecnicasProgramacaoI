/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Fazer um procedimento para receber as notas da primeira e da segunda
prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em
vetores distintos. Calcular e escrever a média de cada aluno.
*/

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] primeiraProvaNotas = new double[5];
        double[] segundaProvaNotas = new double[5];
        for (int i = 0; i < primeiraProvaNotas.length; i++) {
            System.out.printf("Insira a nota da primeira prova do Aluno %d: %n", i + 1);
            primeiraProvaNotas[i] = sc.nextDouble();
            System.out.printf("Insira a nota da segunda prova do Aluno %d: %n", i + 1);
            segundaProvaNotas[i] = sc.nextDouble();
        }
        for (int i = 0; i < primeiraProvaNotas.length; i++) {
            double media = (primeiraProvaNotas[i] + segundaProvaNotas[i]) / 2;
            System.out.printf("Média Aluno %d = %.2f%n", i + 1, media);
        }
        sc.close();
    }
}