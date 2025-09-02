/* 
Nome: Guilherme dos Santos Silva
Ra: 2171392511025
Objetivo: Criar uma coleção na linguagem Java com 10 elementos
– Inserir os elementos de 1 a 10 no vetor
– Após a inserção, somente após a inserção mostrar o vetor.
Obs. Não efetuar a leitura de 10 elementos
*/

public class Colecao {

    public static void main(String[] args) {
        int[] arrayColecao = new int[10];
        for (int i = 1; i <= arrayColecao.length; i++) {
            arrayColecao[i - 1] = i;
        }
        for (int i = 0; i < arrayColecao.length; i++) {
            System.out.println(arrayColecao[i]);
        }
    }
}