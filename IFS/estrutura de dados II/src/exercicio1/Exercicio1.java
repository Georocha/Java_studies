package exercicio1;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 questão
		calculaPotencia(2, 4);
		calculaPotencia(2, 8);
		calculaPotencia(3, 15);
		
		//2 questão
		double[] array = {1.5, 2.7, 3.2, 4.0, 5.1};
		double soma = calculaSoma(array, 0);
		System.out.println("Soma de todos os números do array: " + soma);
		/*int[] vetor = {1,2,3,4,5,6,7,8,9,10};
		somaElementosVetor(vetor, vetor.length);*/
		
		//3 questão
		int[] array2 = {1,2,3,4,5,6,7,8,9,10};
	      int length = array2.length;
	      
	      System.out.println("Original array:");
	      printArray(array2);
	      
	      reverseArray(array2, 0, length -1);
	      
	      System.out.println("\nReverse array:");
	      printArray(array2);
	      
	    //4 questão
	      
	}
	//1 questão
	public static void calculaPotencia(int base, int expoente) {
		int resultado = potencia(base, expoente);
		System.out.println(base + "^" + expoente + "=" + resultado);
	}
	
	private static int potencia(int base, int expoente) {
		System.out.println("potencia " + base + ", "+ expoente);
		if (expoente == 0) {
			System.out.println("Retornando 1...");
			return 1;
		} else {
			System.out.println("Descendo para " + (expoente - 1));
			int potenciaInf = potencia(base, expoente - 1);
			System.out.println("Voltou e vai calcular " + base + "*" + potenciaInf);
			int resultado = base * potenciaInf;
			System.out.println("Retornando " + resultado);
			return resultado;
			//return base * potencia(base, expoente - 1);
		}
	}
	//2 questão
/*	public static void somaElementosVetor(int[] vetor, int tamanho) {
//		int resultadoSomaElementos = somaElementos(int[] vetor, int tamanho);
//		System.out.println("A soma dos elementos é: " + resultadoSomaElementos);
//	}
//	
//	private static int somaElementos(int[] vetor, int tamanho) {
//		
//		if(tamanho == 0) {
//			return 0;
//		} else {
//			return vetor[tamanho - 1] + somaElementos(vetor, tamanho - 1);
//		}
//	}*/
	public static double calculaSoma(double[] array, int index) {
		if (index >= array.length) {
			return 0;
		}
		double elementoAtual = array[index];
		double somaDoResto = calculaSoma(array, index + 1);
		
		return elementoAtual + somaDoResto;
	}
	
	//3 questão
	private static void reverseArray(int[] array, int start, int end){
	        if (start >= end) {
	            return;
	        }
	        
	        int temporario = array[start];
	        array[start] = array[end];
	        array[end] = temporario;
	        
	        reverseArray(array, start + 1, end - 1);
	    }
	    
	public static void printArray(int[] array){
	        for (int number : array){
	            System.out.print(number + " ");
	        }
	        System.out.println();
	 }
}