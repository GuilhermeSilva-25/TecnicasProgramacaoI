/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java para calcular e apresentar o
valor do volume de uma lata de óleo, utilizando a fórmula:
VOLUME <-- 3.14159 * RAIO2 * ALTURA.
*/
import java.util.Scanner;

public class VolumeLata {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double PI = 3.14159;
    System.out.println("Digite a medida do raio da base em cm: ");
    double raioDaBase = sc.nextDouble();
    System.out.println("Digite a medida da altura em cm: ");
    double altura = sc.nextDouble();
    double volume = calcularVolume(PI, raioDaBase, altura);
    System.out.printf("O volume da lata de óleo é: %.2f cm³%n", volume);
    sc.close();
  }

  public static double calcularVolume(double pi, double r, double h) {
    return pi * Math.pow(r, 2) * h;
  }
}
