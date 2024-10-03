package model;

public class Mutante implements Inimigo{
	
	private int vida = 150;
	
	
	@Override
	public void atacar(Jogador jogador) {
		// TODO Auto-generated method stub
		System.out.println("Mutante ataca!");
		int dano = calcularDano();
		jogador.receberDano(dano);
	}

	private int calcularDano() {
		// TODO Auto-generated method stub
		return 25;
	}
	
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		vida -= dano;
		System.out.println("Mutante recebeu" + dano + "de dano.");
	}
	
}
