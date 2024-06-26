package aula02_selectionSort_parte2;

public class OrdenaPorSelecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Lamborghini",1000000);
		produtos[1] = new Produto("Jipe",46000);
		produtos[2] = new Produto("Brasilia",16000);
		produtos[3] = new Produto("Smart",44000);
		produtos[4] = new Produto("Fusca",17000);
		
		imprime(produtos);
		ordena(produtos);
		imprime(produtos);
		
	}

	private static void ordena(Produto[] produtos) {
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
			imprime(produtos);
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
