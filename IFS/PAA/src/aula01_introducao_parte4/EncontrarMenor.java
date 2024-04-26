package aula01_introducao_parte4;

public class EncontrarMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Lamborghini",1000000);
		produtos[1] = new Produto("Jipe",46000);
		produtos[2] = new Produto("Brasilia",16000);
		produtos[3] = new Produto("Smart",44000);
		produtos[4] = new Produto("Fusca",17000);
	
		
		int atual = 0;
		int maisBarato = 0;
		
		for (; atual < 5; ++atual) {
			if (produtos[atual].valor < produtos[maisBarato].valor) {
				maisBarato = atual;
			}
		}
		
		System.out.println("O mais barato é: " + produtos[maisBarato].nome + " (R$:" + produtos[maisBarato].valor + ")");
	}

}
