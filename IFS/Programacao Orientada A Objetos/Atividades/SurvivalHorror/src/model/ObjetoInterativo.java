package model;

public abstract class ObjetoInterativo {
	protected String nome;

	public ObjetoInterativo(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract void interagir();
}
