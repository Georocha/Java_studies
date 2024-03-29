package a04_arvore_binaria_p03;

public class VisitanteBuscador implements Visitante {

	private Object infoBusca;
	private NodoAB resultado;

	public VisitanteBuscador(Object infoBusca) {
		this.infoBusca = infoBusca;
	}

	public void visita(NodoAB nodo) {
		if (infoBusca.equals(nodo.getInfo())) {
			resultado = nodo;
		}
	}

	public NodoAB getResultado() {
		return resultado;
	}
}
