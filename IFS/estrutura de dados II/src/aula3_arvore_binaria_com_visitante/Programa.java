package aula3_arvore_binaria_com_visitante;

public class Programa {

	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		NodoArvoreBinaria raiz = arvore.criaRaiz("+");
		
		System.out.println("Tamanho: " + arvore.getTamanho());
		
		NodoArvoreBinaria produto = arvore.insereEsquerda(raiz, "*");
		arvore.insereEsquerda(produto, "A");
		arvore.insereDireita(produto, "B");
		
		System.out.println("Tamanho: " + arvore.getTamanho());
		
		NodoArvoreBinaria divisao = arvore.insereDireita(raiz, "/");
		arvore.insereEsquerda(divisao, "C");
		arvore.insereDireita(divisao, "D");
		
		System.out.println("Tamanho: " + arvore.getTamanho());
		
		System.out.println(arvore);
		
		System.out.println("Travessia Pré ordem:");
		ImpressaoVisitante impressora = new ImpressaoVisitante();
		arvore.travessiaPreOrdem(impressora);
		
	}

}
