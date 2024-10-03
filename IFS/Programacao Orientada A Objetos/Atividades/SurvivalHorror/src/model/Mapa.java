package model;

public class Mapa {
	
	private static Mapa instancia;
	
	private Mapa() {
		
	}
	
	public static Mapa getInstancia() {
		if (instancia == null) {
			instancia = new Mapa();
		}
		return instancia;
	}
	
	public void exibir() {
		System.out.println("Exibindo o mapa da mansão");
	}
}
