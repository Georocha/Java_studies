package aula3_arvore_binaria_com_visitante;

public class ImpressaoVisitante implements Visitante {

	@Override
	public void visita(NodoArvoreBinaria nodo) {
		System.out.println(nodo.getInfo());
	}

}
