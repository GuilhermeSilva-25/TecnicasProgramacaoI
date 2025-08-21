/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java para efetuar a leitura de um
número inteiro e apresentar o resultado do quadrado desse número.
*/
import java.util.Scanner;

public class NumeroAoQuadrado {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor: ");
    int valor = sc.nextInt();
    int valorAoQuadrado = (int) Math.pow(valor, 2);
    System.out.printf("%d ao quadrado é %d%n", valor, valorAoQuadrado);
    sc.close();
  }
}
