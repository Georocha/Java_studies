package a05_arvore_binaria_busca_p01;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBB abb = new ArvoreBB();
		abb.adiciona(37);
		abb.adiciona(20);
		abb.adiciona(10);
		abb.adiciona(80);
		abb.adiciona(100);
		abb.adiciona(90);
		abb.adiciona(30);
		abb.adiciona(180);
		abb.adiciona(5);
		
		System.out.println(abb);
		System.out.println(abb.getTamanho());
		
		System.out.println(abb.busca(30));
		System.out.println(abb.busca(32));
		
		System.out.println("grau do 37: " + abb.busca(37).grau());
		System.out.println("grau do 10: " + abb.busca(10).grau());
		System.out.println("grau do 5: " + abb.busca(5).grau());

		System.out.println("nivel do 37: " + abb.busca(37).nivel());
		System.out.println("nivel do 100: " + abb.busca(100).nivel());
		
		System.out.println("altura de 20: " + abb.busca(20).altura());
		
	}

}
