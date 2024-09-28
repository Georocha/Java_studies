package br.edu.ifs.loja.model;

public class Item {
	public String nome;
	public double preco;
	public Item(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}