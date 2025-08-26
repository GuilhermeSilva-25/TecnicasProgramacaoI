/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.
*/

import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite um valor inteiro: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite um valor inteiro: ");
        int valor3 = sc.nextInt();
        if (valor1 >= valor2 && valor3 <= valor2) {
            System.out.printf("%d, %d, %d%n", valor3, valor2, valor1);
        } else if (valor1 >= valor3 && valor2 <= valor3) {
            System.out.printf("%d, %d, %d%n", valor2, valor3, valor1);
        } else if (valor2 >= valor1 && valor3 <= valor1) {
            System.out.printf("%d, %d, %d%n", valor3, valor1, valor2);
        } else if (valor2 >= valor3 && valor1 <= valor3) {
            System.out.printf("%d, %d, %d%n", valor1, valor3, valor2);
        } else if (valor3 >= valor1 && valor2 <= valor1) {
            System.out.printf("%d, %d, %d%n", valor2, valor1, valor3);
        } else if (valor3 >= valor2 && valor1 <= valor2) {
            System.out.printf("%d, %d, %d%n", valor1, valor2, valor3);
        }
        sc.close();
    }
}
