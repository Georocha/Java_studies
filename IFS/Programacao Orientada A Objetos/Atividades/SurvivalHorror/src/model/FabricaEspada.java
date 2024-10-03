package model;

public class FabricaEspada extends FabricaItem {

	@Override
	public Item criarItem() {
		// TODO Auto-generated method stub
		return new Espada();
	}

}
