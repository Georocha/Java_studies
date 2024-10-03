package model;

public class Espada implements Item {
	
	private int dano = 15;

	@Override
	public void usar(Jogador jogador) {
		// TODO Auto-generated method stub
		System.out.println("Jogador equipou uma espada lendária com " + dano + " pontos de dano!");
		jogador.aumentarDano(dano);
		
	}
	
}
