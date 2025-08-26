/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java para apresentar o total da soma
obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).
*/

public class Soma100 {
    
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.printf("O total da soma obtida dos cem primeiros números interios é = %d%n", soma);
    }
}
