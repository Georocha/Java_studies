package model;

public class Zumbi implements Inimigo {
	
	private int vida = 120;
	
	@Override
	public void atacar(Jogador jogador) {
		// TODO Auto-generated method stub
		int dano = calcularDano();
		System.out.println("Zumbi ataca!");
		jogador.receberDano(dano);
	}

	private int calcularDano() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		vida -= dano;
		System.out.println("Zumbi recebeu" + dano + "de dano.");
	}
	
}
