/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java para ler dois valores inteiros
para as variáveis A e B e efetuar a troca dos valores de forma que a
variável A passe a possuir o valor da variável B e a variável B passe
a possuir o valor da variável A. Apresentar os valores trocados.
*/
import java.util.Scanner;

public class TrocaDeValor {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor de A:");
    int a = sc.nextInt();
    System.out.println("Digite valor de B:");
    int b = sc.nextInt();
    int variavelAuxiliar = a;
    a = b;
    b = variavelAuxiliar;
    System.out.printf("A = %d e B = %d%n", a, b);
    sc.close();
  }
}
