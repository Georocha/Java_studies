package aula3_arvore_binaria_com_visitante;

public class ArvoreBinaria {
	
	private NodoArvoreBinaria raiz;
	private int tamanho;
	
	public NodoArvoreBinaria criaRaiz(Object info) {
		if (raiz != null) {
			throw new RuntimeException("Raiz já existe");
		}
		raiz = new NodoArvoreBinaria(info);
		tamanho++;
		return raiz;
	}
	
	public NodoArvoreBinaria getRaiz() {
		return raiz;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public NodoArvoreBinaria insereEsquerda(NodoArvoreBinaria pai, Object info) {
		if (pai.getEsquerdo() != null) {
			throw new RuntimeException("Filho esquerdo já existe!");
		}
		NodoArvoreBinaria nodo = new NodoArvoreBinaria(info);
		nodo.setPai(pai);
		pai.setEsquerdo(nodo);
		tamanho++;
		return nodo;
	}
	
	public NodoArvoreBinaria insereDireita(NodoArvoreBinaria pai, Object info) {
		if (pai.getDireito() != null) {
			throw new RuntimeException("Filho direito já existe!");
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
		if (nodo != null) {
			if (nodo.getEsquerdo() != null || nodo.getDireito() != null) {
				sb.append("(");
			}
			// desce para esquerda
			if (nodo.getEsquerdo() != null) {
				montaStringCentralEsquerda(nodo.getEsquerdo(), sb);
			}
			// processa nodo
			sb.append(nodo.getInfo());
			// desce para direita
			if (nodo.getDireito() != null) {
				montaStringCentralEsquerda(nodo.getDireito(), sb);
			}
			if (nodo.getEsquerdo() != null || nodo.getDireito() != null) {
				sb.append(")");
			}
		}
	}

	public void travessiaPreOrdem(Visitante visitante) {
		travessiaPreOrdem(raiz, visitante);
	}

	private void travessiaPreOrdem(NodoArvoreBinaria nodo, Visitante visitante) {
		if (nodo != null) {
			// processa nodo
			visitante.visita(nodo);

			// desce para esquerda
			if (nodo.getEsquerdo() != null) {
				travessiaPreOrdem(nodo.getEsquerdo(), visitante);
			}

			// desce para direita
			if (nodo.getDireito() != null) {
				travessiaPreOrdem(nodo.getDireito(), visitante);
			}
		}
	}

	public void travessiaEmOrdem(Visitante visitante) {
		travessiaEmOrdem(raiz, visitante);
	}

	private void travessiaEmOrdem(NodoArvoreBinaria nodo, Visitante visitante) {
		if (nodo != null) {
			// desce para esquerda
			if (nodo.getEsquerdo() != null) {
				travessiaPreOrdem(nodo.getEsquerdo(), visitante);
			}

			// processa nodo
			visitante.visita(nodo);

			// desce para direita
			if (nodo.getDireito() != null) {
				travessiaPreOrdem(nodo.getDireito(), visitante);
			}
		}
	}

	public void travessiaPosOrdem(Visitante visitante) {
		travessiaPosOrdem(raiz, visitante);
	}

	private void travessiaPosOrdem(NodoArvoreBinaria nodo, Visitante visitante) {
		if (nodo != null) {
			// desce para esquerda
			if (nodo.getEsquerdo() != null) {
				travessiaPreOrdem(nodo.getEsquerdo(), visitante);
			}

			// desce para direita
			if (nodo.getDireito() != null) {
				travessiaPreOrdem(nodo.getDireito(), visitante);
			}

			// processa nodo
			visitante.visita(nodo);
		}
	}
	
	
}
