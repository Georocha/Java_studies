package aula02_selectionSort_parte3;

public class OrdenaPorSelecao {

	public static void ordena(Produto[] produtos) {
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("indice atual: " + i);
			Produto atual = produtos[i];
			System.out.println("produto atual: " + atual);
			
			// Encontra o menor
			int indiceMenor = buscaMenor(produtos, i, produtos.length);
			Produto menor = produtos[indiceMenor];
			System.out.println("menor produto: " + menor);
			
			// Faz a troca
			produtos[indiceMenor] = atual;
			produtos[i] = menor;
			
		}
	}
	
	private static int buscaMenor(Produto[] produtos, int inicio, int fim) {

		int maisBarato = inicio;
		for (int atual = inicio; atual < fim; ++atual) {
			if (produtos[atual].valor < produtos[maisBarato].valor) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}
	
}
