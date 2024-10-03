package model;

public class Humanoides implements Inimigo{
	
	private int vida = 115;
	
	@Override
	public void atacar(Jogador jogador) {
		// TODO Auto-generated method stub
		System.out.println("Humanoide ataca!");
		int dano = calcularDano();
		jogador.receberDano(dano);
	}
	
	private int calcularDano() {
		return 15;
	}
	
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		vida -= dano;
		System.out.println("humanoide recebeu" + dano + "de dano.");
	}
	
}
