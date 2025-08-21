/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java que receba 2 números e apresente a multiplicação dos dois números.
*/
import java.util.Scanner;

public class Multiplicacao {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    double numero1 = sc.nextDouble();
    System.out.println("Digite o segundo número: ");
    double numero2 = sc.nextDouble();
    double multiplicacao = numero1 * numero2;
    System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, multiplicacao);
    sc.close();
  }
}
