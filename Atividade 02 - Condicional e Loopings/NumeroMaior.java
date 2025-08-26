/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java que leia 3 números inteiros e mostre
o maior deles.
*/

import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite um número inteiro: ");
        int numero2 = sc.nextInt();
        System.out.println("Digite um número inteiro: ");
        int numero3 = sc.nextInt();
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os números são iguais");
        } else if (numero1 >= numero2 && numero3 <= numero2) {
            System.out.printf("%d é o maior%n", numero1);
        } else if (numero1 >= numero3 && numero2 <= numero3) {
            System.out.printf("%d é o maior%n", numero1);
        } else if (numero2 >= numero1 && numero3 <= numero1) {
            System.out.printf("%d é o maior%n", numero2);
        } else if (numero2 >= numero3 && numero1 <= numero3) {
            System.out.printf("%d é o maior%n", numero2);
        } else if (numero3 >= numero1 && numero2 <= numero1) {
            System.out.printf("%d é o maior%n", numero3);
        } else if (numero3 >= numero2 && numero1 <= numero2) {
            System.out.printf("%d é o maior%n", numero3);
        }
        sc.close();
    }
}
