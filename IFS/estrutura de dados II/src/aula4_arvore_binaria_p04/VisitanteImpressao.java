package a04_arvore_binaria_p04;

public class VisitanteImpressao implements Visitante {

	@Override
	public void visita(NodoAB nodo) {
		System.out.println(nodo.getInfo());
	}

}
