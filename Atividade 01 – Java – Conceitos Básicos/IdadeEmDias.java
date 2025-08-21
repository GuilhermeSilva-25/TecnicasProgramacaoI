/* 
Guilherme dos Santos Silva
2171392511025
Faça um programa na Linguagem Java que leia a idade de uma
pessoa expressa em ano, mês e dia e mostre-as em dias.
*/
import java.util.Scanner;

public class IdadeEmDias {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o dia do seu nascimento:");
    int diaNascimento = sc.nextInt();
    System.out.println("Digite o número do mês do seu nascimento: ");
    int mesNascimento = sc.nextInt();
    System.out.println("Digite o ano do seu nascimento:");
    int anoNascimento = sc.nextInt();
    int totalEmDias = calcularDias(diaNascimento, mesNascimento, anoNascimento);
    System.out.printf("A idade em dias é: %d dias%n", totalEmDias);
    sc.close();
  }

  public static int calcularDias(int dia, int mes, int ano) {
    // Considerando todos os meses com 30 dias e todos os anos com 365 dias.
    return dia + (mes * 30) + (ano * 365);
  }
}
