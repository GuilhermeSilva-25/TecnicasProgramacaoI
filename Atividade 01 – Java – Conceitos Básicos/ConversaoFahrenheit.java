/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java que leia uma temperatura em
graus Celsius e apresentá-la convertida em graus Fahrenheit. A
fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura
em Fahrenheit e C a temperatura em Celsius.
*/
import java.util.Scanner;

public class ConversaoFahrenheit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digita temperatura em ºF: ");
    double temperaturaCelsius = sc.nextDouble();
    double temperaturaFanrenheit = conversaoFahrenheit(temperaturaCelsius);
    System.out.printf("%.1fºC equivale à %.1fºF%n", temperaturaCelsius, temperaturaFanrenheit);
    sc.close();
  }

  public static double conversaoFahrenheit(double C) {
    return (9 * C + 160) / 5;
  }
}
