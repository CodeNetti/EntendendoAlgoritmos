package searchBinary;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int item ;
        int inicio = 0;
        int fim = lista.length - 1;
        Scanner scanner = new Scanner(System.in) ;

        while (true) {
            System.out.println("Digite o N que deseja saber a posição em um Array de 10 números");

            if (scanner.hasNextInt()) {
                item = scanner.nextInt();
                int resultado = FunctionSearch.Binary_Search(lista, item, inicio, fim);
                scanner.close();

                if(resultado == -1) {
                    System.out.println("O número não existe no vetor.");
                } else {
                    System.out.println("A posição do número "+ item +" no vetor é: "+ resultado);
                }
                
                break; 
            } else {
                System.out.println("Por favor, digite um número inteiro.");
                scanner.nextLine(); 
            }
        }
    }
}
