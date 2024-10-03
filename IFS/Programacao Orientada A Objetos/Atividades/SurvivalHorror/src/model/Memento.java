package model;

public class Memento {
	
	private final String estado;
	
	public Memento(String estado) {
		 this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
}
