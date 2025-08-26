/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java que efetue a leitura de cinco números
inteiros e identificar o maior e o menor valor. Não execute a ordenação de
valores.
*/

import java.util.Scanner;

public class MaiorEMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMaior = 0;
        int numeroMenor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número inteiro: ");
            int entrada = sc.nextInt();
            if (i == 1) {
                numeroMaior = entrada;
                numeroMenor = entrada;
            }
            if (entrada > numeroMaior) {
                numeroMaior = entrada;
            } else if (entrada < numeroMenor) {
                numeroMenor = entrada;
            }
        }
        System.out.printf("O maior número é: %d%nO menor número é: %d%n", numeroMaior, numeroMenor);
        sc.close();
    }
}
