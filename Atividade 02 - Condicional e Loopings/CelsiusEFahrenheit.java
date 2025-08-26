/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Faça um programa na Linguagem Java que apresente os valores de
conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a
contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa
deve apresentar os valores das duas temperaturas.
*/

import java.util.Locale;

public class CelsiusEFahrenheit {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double celsius = 10;
        while (celsius <= 100) {
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("%.1fºC %.1fºF%n", celsius, fahrenheit);
            celsius += 10;
        }
    }
}
