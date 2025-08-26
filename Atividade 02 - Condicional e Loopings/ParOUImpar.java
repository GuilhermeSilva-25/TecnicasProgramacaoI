/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java que efetue a leitura de um número
inteiro e apresentar uma mensagem informando se o número é par ou ímpar.
*/

import java.util.Scanner;

public class ParOUImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.printf("O número %d é par.%n", numero);
        } else {
            System.out.printf("O número %d é ímpar.%n", numero);
        }
        sc.close();
    }
}
