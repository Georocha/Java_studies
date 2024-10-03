package controller;

import model.Item;
import model.Jogador;
import model.Sala;

public class ControladorDeJogo {
	
	private Jogador jogador;
	private Sala sala;
	
	public ControladorDeJogo(Jogador jogador, Sala sala) {
		super();
		this.jogador = jogador;
		this.sala = sala;
	}
	
	public void pegarUsarItem() {
		Item item = sala.pegarItem();
		if (item != null) {
			item.usar(jogador);
		}
	}
	
}
