/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: O cardápio de uma lanchonete é o seguinte:
Especificação         Código    Preço
Cachorro quente       100       1,20
Bauru simples         101       1,30
Bauru com ovo         102       1,50
Hambúrger             103       1,20
Cheeseburguer         104       1,30
Refrigerante          105       1,00
Faça um programa na Linguagem Java que leia o código do item pedido, a
quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada
execução somente será calculado um item.
*/

import java.util.Scanner;

public class ValorLanche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do lanche: ");
        int codigoItem = sc.nextInt();
        System.out.println("Digite a quantidade de lanches do pedido: ");
        int quantidadeLanches = sc.nextInt();
        double valor;
        switch (codigoItem) {
            case 100:
                valor = 1.20 * quantidadeLanches;
                System.out.printf("O valor a ser pago é R$ %.2f%n", valor);
                break;
            case 101:
                valor = 1.30 * quantidadeLanches;
                System.out.printf("O valor a ser pago é R$ %.2f%n", valor);
                break;
            case 102:
                valor = 1.50 * quantidadeLanches;
                System.out.printf("O valor a ser pago é R$ %.2f%n", valor);
                break;
            case 103:
                valor = 1.20 * quantidadeLanches;
                System.out.printf("O valor a ser pago é R$ %.2f%n", valor);
                break;
            case 104:
                valor = 1.30 * quantidadeLanches;
                System.out.printf("O valor a ser pago é R$ %.2f%n", valor);
                break;
            case 105:
                valor = 1.00 * quantidadeLanches;
                System.out.printf("O valor a ser pago é R$ %.2f%n", valor);
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }
        sc.close();
    }
}
