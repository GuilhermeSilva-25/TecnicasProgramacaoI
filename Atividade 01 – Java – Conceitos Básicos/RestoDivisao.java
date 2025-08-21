/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java que receba um número e
mostre o resto da divisão por 6.
*/
import java.util.Scanner;

public class RestoDivisao {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor:");
    int valor = sc.nextInt();
    int restoDivisao = valor % 6;
    System.out.printf("O resto da divisão do valor digitado é %d%n", restoDivisao);
    sc.close();
  }
}
