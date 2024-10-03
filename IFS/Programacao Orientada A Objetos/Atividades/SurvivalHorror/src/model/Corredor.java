package model;

import java.util.ArrayList;
import java.util.List;

public class Corredor implements ComponenteMansao {
	
	private String nome;
	private List<ComponenteMansao> componentes = new ArrayList<>();
	
	public Corredor(String nome) {
		this.nome = nome;
	}
	
	public void adicionar(ComponenteMansao componente) {
		componentes.add(componente);
	}
	
	public void remover(ComponenteMansao componente) {
		componentes.remove(componente);
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		System.out.println("Corredor: " + nome);
		for (ComponenteMansao componente : componentes) {
			componente.exibir();
		}
	}

	public List<ComponenteMansao> getComponentes() {
		return componentes;
	}
	
}
