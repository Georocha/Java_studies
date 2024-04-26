package aula01_introducao_parte1;

public class EncontrarMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precos[] = new double[5];
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 44000;
		precos[4] = 17000;

		int atual = 0;
		double maisBarato = Double.MAX_VALUE;
		
		for (; atual < 5; ++atual) {
			if (precos[atual] < maisBarato) {
				maisBarato = precos[atual];
			}
		}
		
		System.out.println("O preço mais barato é: " + maisBarato);
	}

}
