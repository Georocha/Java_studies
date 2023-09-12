package exercicio1;

public class SomaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vetor1 = new double[] {2.5,3.5,4.4,6,6};
		System.out.println(soma(vetor1, vetor1.length - 1));
		
		double[] vetor2 = new double[] {2.5,3.5,4.4,6,6};
		System.out.println(soma2(vetor2, vetor2.length));
		
	}
	
	public static double soma(double vetor[], int posicao) {
		if (posicao < 0) {
			return 0;
		} else {
			return vetor[posicao] + soma(vetor, posicao -1 );
		}
	}
	public static double soma2(double vetor[], int tamanho) {
		if (tamanho <= 0) {
			return 0;
		} else {
			return vetor[tamanho - 1] + soma2(vetor, tamanho -1 );
		}
	}
}
