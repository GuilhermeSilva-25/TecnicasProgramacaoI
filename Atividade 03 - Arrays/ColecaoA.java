/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Criar uma coleção “A” na linguagem Javacom 10 elementos
– Inserir os elementos de 1 a 10 na coleção
– Criar uma outra coleção B que conterá o elemento da coleção A
multiplicado por 2
– Mostrar as duas coleções
Obs. Não efetuar a leitura de 10 elementos
*/

public class ColecaoA {

    public static void main(String[] args) {
        int[] arrayColecaoA = new int[10];
        int[] arrayColecaoB = new int[10];
        for (int i = 1; i <= arrayColecaoA.length; i++) {
            arrayColecaoA[i - 1] = i;
            arrayColecaoB[i - 1] = i * 2;
        }
        for (int i = 0; i < arrayColecaoA.length; i++) {
            System.out.printf("Coleção A = %d  Coleção B = %d%n", arrayColecaoA[i], arrayColecaoB[i]);
            
        }
    }
}