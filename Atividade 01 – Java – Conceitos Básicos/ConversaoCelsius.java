/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java que leia uma temperatura
em graus Fahrenheit e apresentá-la convertida em graus Celsius. A
formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura
em Fahrenheit e C a temperatura em Celsius.
*/
import java.util.Scanner;

public class ConversaoCelsius {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digita temperatura em ºC: ");
    double temperaturaFanrenheit = sc.nextDouble();
    double temperaturaCelsius = conversaoCelsius(temperaturaFanrenheit);
    System.out.printf("%.1fºF equivale à %.1fºC%n",temperaturaFanrenheit, temperaturaCelsius);
    sc.close();
  }

  public static double conversaoCelsius(double F) {
    return (F - 32) * (5.0/9.0);
  }
}