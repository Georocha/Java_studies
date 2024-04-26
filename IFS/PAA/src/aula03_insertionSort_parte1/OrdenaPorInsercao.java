package aula03_insertionSort_parte1;

public class OrdenaPorInsercao {

	public static void ordena(Produto[] produtos) {
		for (int atual = 1; atual < produtos.length; atual++) {
			int analise = atual;
			System.out.println("indice atual: " + atual);
			
			while (analise > 0 && produtos[analise].valor < produtos[analise - 1].valor) {
				System.out.println("analise: " + analise);
				System.out.println("Descolando para trás: " + produtos[analise]);
				moverParaTras(produtos, analise);
				imprime(produtos);
				analise --;
			}
		}
	}
	
	private static void moverParaTras(Produto[] produtos, int posicao) {
		Produto prodAnalise = produtos[posicao];
		produtos[posicao] = produtos[posicao - 1];
		produtos[posicao - 1] = prodAnalise;
	}
	
	private static void imprime(Produto[] produtos) {
		System.out.print("[");
		for (int i = 0; i < produtos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(produtos[i]);
		}
		System.out.println("]");
	}
}
