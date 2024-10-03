package model;

import java.util.ArrayList;
import java.util.List;

public class Sala implements ComponenteMansao {
	private String nome;
	private List<Item> itens = new ArrayList<>();
	
	public Sala(String nome) {
		this.nome = nome;
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		System.out.println("Sala: " + nome);
		
	}

	public void adicionarItem(Item item) {
		itens.add(item);
	}
	
	public Item pegarItem() {
		if(!itens.isEmpty()) {
			return itens.remove(0);
		} else {
			System.out.println("Nenhum item disponível na sala!");
			return null;
		}
	}
}
