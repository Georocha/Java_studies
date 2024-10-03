package model;

public class KitMedico implements Item {
	
	private int cura = 20;

	@Override
	public void usar(Jogador jogador) {
		// TODO Auto-generated method stub
		jogador.cura(cura);
		System.out.println("Jogador usou kit médico!");
	}
	
	
	
}
