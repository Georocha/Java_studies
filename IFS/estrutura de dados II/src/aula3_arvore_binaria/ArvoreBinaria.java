package aula3_arvore_binaria;


public class ArvoreBinaria {

	private NodoArvoreBinaria raiz;
	
	public NodoArvoreBinaria getRaiz() {
		return raiz;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public NodoArvoreBinaria criaRaiz(Object info) {
		if (raiz != null) {
			throw new RuntimeException("raiz já existe");
		}
		raiz = new NodoArvoreBinaria(info);
		return raiz;
	}
	
	public NodoArvoreBinaria insereEsquerda(NodoArvoreBinaria pai, Object info) {
		
		if (pai.getEsquerdo() != null) {
			throw new RuntimeException("Filho a esquerda já existe");
		}
		NodoArvoreBinaria nodo = new NodoArvoreBinaria(info);
		nodo.setPai(pai);
		pai.setEsquerdo(nodo);
		tamanho++;
		return nodo;
	}
	
	public NodoArvoreBinaria insereDireita(NodoArvoreBinaria pai, Object info) {
		
		if (pai.getDireito() != null) {
			throw new RuntimeException("Filho a esquerda já existe");
		}
		NodoArvoreBinaria nodo = new NodoArvoreBinaria(info);
		nodo.setPai(pai);
		pai.setDireito(nodo);
		tamanho++;
		return nodo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		montaStringCentralEsquerda(raiz, sb);
		return sb.toString();
	}
	
	private void montaStringCentralEsquerda(NodoArvoreBinaria nodo, StringBuilder sb) {
		if (nodo != null ) {
			if (nodo.getEsquerdo() != null || nodo.getDireito() != null) {
				sb.append("(");
			}
			// desce para a esquerda
			if (nodo.getEsquerdo() != null) {
				montaStringCentralEsquerda(nodo.getEsquerdo(), sb);
			}
			// processa nodo
			sb.append(nodo.getInfo());
			// desce para a direita
			if (nodo.getDireito() != null) {
				montaStringCentralEsquerda(nodo.getDireito(), sb);
			}
			if (nodo.getEsquerdo() != null || nodo.getDireito() != null) {
				sb.append(")");
			}

		}
	}
}
