/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java que que receba um número e mostre
o fatorial desse número.
*/

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int fatorial = numero;
        for (int i = numero - 1; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.printf("!%d = ", numero);
        for (int i = numero; i > 1; i--) {
            System.out.printf("%d * ", i);
        }
        System.out.printf("1 = %d%n", fatorial);
        sc.close();
    }
}
