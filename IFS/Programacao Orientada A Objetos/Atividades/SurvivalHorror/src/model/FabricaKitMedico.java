package model;

public class FabricaKitMedico extends FabricaItem {

	@Override
	public Item criarItem() {
		// TODO Auto-generated method stub
		return new KitMedico();
	}
	
	
	
}
