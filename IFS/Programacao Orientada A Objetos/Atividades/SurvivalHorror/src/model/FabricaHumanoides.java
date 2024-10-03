package model;

public class FabricaHumanoides extends FabricaInimigo {

	@Override
	public Inimigo criarInimigo() {
		// TODO Auto-generated method stub
		return new Humanoides();
	}

}
