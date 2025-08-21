/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java que efetue a apresentação
do valor da conversão em real de um valor lido em dólar. O programa
deve solicitar o valor da cotação do dólar e também a quantidade de
dólares disponível com o usuário, para que seja apresentado o valor
em moeda brasileira.
*/
import java.util.Scanner;

public class ConversaoReal {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a cotação do Dólar em Real:");
    double cotacaoDolar = sc.nextDouble();
    System.out.println("Digite a quantidade de dolares disponível:");
    double quantidadeDolar = sc.nextDouble();
    double quantidadeReal = conversaoEmReal(cotacaoDolar, quantidadeDolar);
    System.out.printf("A quantidade em Real é R$ %.2f%n", quantidadeReal);
    sc.close();
  }

  public static double conversaoEmReal(double cotacaoDolar, double quantidadeDolar) {
    return cotacaoDolar * quantidadeDolar;
  }
}
