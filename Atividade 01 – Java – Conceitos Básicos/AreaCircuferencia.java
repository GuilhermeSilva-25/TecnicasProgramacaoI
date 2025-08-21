/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java que calcule a área da
circunferência.
*/
import java.util.Scanner;

public class AreaCircuferencia {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double PI = 3.14159;
    System.out.println("Digite o raio do circulo em cm: ");
    double raioCirculo = sc.nextDouble();
    double areaCircuferencia = calcularAreaCircuferencia(PI, raioCirculo);
    System.out.printf("A área da circuferência é: %.2f cm²%n", areaCircuferencia);
    sc.close();
  }

  public static double calcularAreaCircuferencia(double pi, double r) {
    return pi * Math.pow(r, 2);
  }
}
