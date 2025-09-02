/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Criar um vetor A do tipo inteiro de 5 elementos
– Solicitar os valores para o usuário e inserir no vetor A
– Criar um vetor B do tipo inteiro
– Ler o vetor A e para cada elemento lido calcular o fatorial e gravar
no B
– Após de todos os elementos do vetor A, mostrar os dois vetores
*/

import java.util.Scanner;

public class VetorComFatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayColecaoA = new int[5];
        int[] arrayColecaoB = new int[5];
        for (int i = 0; i < arrayColecaoA.length; i++) {
            System.out.println("Digite um valor: ");
            arrayColecaoA[i] = sc.nextInt();
            arrayColecaoB[i] = calcularFatorial(arrayColecaoA[i]);
        }
        for (int i = 0; i < arrayColecaoA.length; i++) {
            System.out.printf("Vetor A posição %d = %d  Vetor B posição %d = %d%n", i + 1, arrayColecaoA[i], i + 1,
                    arrayColecaoB[i]);
        }
        sc.close();
    }

    public static int calcularFatorial(int value) {
        int numero = value;
        int fatorial = numero;
        for (int i = numero - 1; i >= 1; i--) {
            fatorial *= i;
        }

        return fatorial;
    }
}