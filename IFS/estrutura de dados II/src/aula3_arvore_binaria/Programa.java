package aula3_arvore_binaria;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBinaria arvore = new ArvoreBinaria();
		NodoArvoreBinaria raiz = arvore.criaRaiz("+");
		
		NodoArvoreBinaria produto = arvore.insereEsquerda(raiz, "*");
		arvore.insereEsquerda(produto, "A");
		arvore.insereDireita(produto, "B");
		
		NodoArvoreBinaria divisao = arvore.insereDireita(raiz, "/");
		arvore.insereEsquerda(divisao, "C");
		arvore.insereDireita(divisao, "D");
		
		System.out.println(arvore);
		
	}

}
