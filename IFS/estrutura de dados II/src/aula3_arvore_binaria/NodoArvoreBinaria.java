package aula3_arvore_binaria;

public class NodoArvoreBinaria {
	
	private Object info;
	private NodoArvoreBinaria pai;
	private NodoArvoreBinaria esquerdo;
	private NodoArvoreBinaria direito;
	
	public NodoArvoreBinaria(Object info) {
		setInfo(info);
	}

	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public NodoArvoreBinaria getPai() {
		return pai;
	}

	public void setPai(NodoArvoreBinaria pai) {
		this.pai = pai;
	}

	public NodoArvoreBinaria getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(NodoArvoreBinaria esquerdo) {
		this.esquerdo = esquerdo;
	}

	public NodoArvoreBinaria getDireito() {
		return direito;
	}

	public void setDireito(NodoArvoreBinaria direito) {
		this.direito = direito;
	}

}
