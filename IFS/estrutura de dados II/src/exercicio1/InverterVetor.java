package exercicio1;


public class InverterVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vetor1 = new double[] {2.5,3.5,4.4,6,6};
		inverte(vetor1, 0, vetor1.length -1);
		imprime(vetor1);
		
	}
	
	
	private static void inverte(double[] vetor, int esquerda, int direita) {
		if (esquerda > direita) {
			return;
		} else {
			double temp = vetor[esquerda];
			vetor[esquerda] = vetor[direita];
			vetor[direita] = temp;
			inverte(vetor, esquerda + 1, direita -1);
		}
	}
	
	public static void imprime(double[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(vetor[i]);
		}
		System.out.println("]");
	}
}
