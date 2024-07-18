package model;

import java.time.LocalDate;

public class Produto {
	
	private String nome;
	private String descricao;
	private int quantidade;
	private double preco;
	private LocalDate validade;
	
	public Produto(String nome, String descricao, int quantidade, double preco, LocalDate validade) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
        return descricao;
    }
	
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public LocalDate getValidade() {
        return validade;
    }
	
	public void entrada(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public boolean saida(int quantidade) {
		if (this.quantidade >= quantidade) {
			this.quantidade -= quantidade;
			return true;
		} else {
			return false;
		}
	}
}
