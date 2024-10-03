package model;

public class FabricaZumbi extends FabricaInimigo {

	@Override
	public Inimigo criarInimigo() {
		// TODO Auto-generated method stub
		return new Zumbi();
	}

}
