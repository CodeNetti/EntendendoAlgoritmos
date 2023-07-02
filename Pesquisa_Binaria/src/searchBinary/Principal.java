package searchBinary;

public class Principal {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int item = 10;
        int inicio = 0;
        int fim = lista.length - 1;

        int resultado = FunctionSearch.Binary_Search(lista, item, inicio, fim);

        System.out.println("A Número do"+" "+item+" "+"No vetor é a posição:"+" "+resultado);
    }
}
