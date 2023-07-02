package searchBinary;

public class FunctionSearch {
	
	public static int Binary_Search(int[] lista, int item, int inicio, int fim) 
	{
		
		if (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			if (lista[meio] == item) {
				return meio;
			}
			if (item < lista[meio]) {
				return Binary_Search(lista, item, inicio, meio - 1);
			} 
			else {
				return Binary_Search(lista, item, meio + 1, fim);
			}
		}
		return -1;
	}

}
