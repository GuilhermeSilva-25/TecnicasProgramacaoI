/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java que leia quatros valores referentes a
quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o
aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno
não foi aprovado, indicar uma mensagem informando esta condição. Apresentar
junto das mensagens o valor da média do aluno para qualquer condição.
*/

import java.util.Scanner;

public class MediaEscolar {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a primeira nota: ");
    double nota1 = sc.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2 = sc.nextDouble();
    System.out.println("Digite a terceira nota: ");
    double nota3 = sc.nextDouble();
    System.out.println("Digite a quarta nota: ");
    double nota4 = sc.nextDouble();
    double media = (nota1 + nota2 + nota3 + nota4) / 4;
    if (media >= 7) {
      System.out.printf("A média do aluno(a) é %.2f. Está APROVADO(A)%n", media);
    } else {
      System.out.printf("A média do aluno(a) é %.2f. Está REPROVADO(A)%n", media);
    }
    sc.close();
  }
}
