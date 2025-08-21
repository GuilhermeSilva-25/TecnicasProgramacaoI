/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java para efetuar o cálculo e a
apresentação do valor de uma prestação em atraso, utilizando a
fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) *
TEMPO).
*/
import java.util.Scanner;

public class PrestacaoAtrasada {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor da prestação:");
    double valorPrestacao = sc.nextDouble();
    System.out.println("Digite o valor da taxa de atraso:");
    double valorTaxa = sc.nextDouble();
    System.out.println("Digite quantos dias a prestação está atrasada:");
    int diasAtraso = sc.nextInt();
    double valorPrestacaoAtrasada = calcularValorPrestacao(valorPrestacao, valorTaxa, diasAtraso);
    System.out.printf("O novo valor da prestação é R$ %.2f%n", valorPrestacaoAtrasada);
    sc.close();
  }

  public static double calcularValorPrestacao(double valor, double taxa, double tempo) {
    return valor + (valor * (taxa/100) * tempo);
  }
}
