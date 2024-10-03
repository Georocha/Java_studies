package model;

public class FabricaMutante extends FabricaInimigo {

	@Override
	public Inimigo criarInimigo() {
		// TODO Auto-generated method stub
		return new Mutante();
	}

}
