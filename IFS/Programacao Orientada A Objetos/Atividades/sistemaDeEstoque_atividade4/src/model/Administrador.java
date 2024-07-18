package model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {

	private List<Produto> produtos;
	
	public Administrador(String nome, String login, String senha) {
		super(nome, login, senha);
		this.produtos = new ArrayList<>();
	}

	@Override
	public String nivelDeAcesso() {
		// TODO Auto-generated method stub
		return "Administrador";
	}
	
	public void cadastrarProduto(Produto produto) {
		if (!this.nivelDeAcesso().equals("Administrador")) {
			throw new IllegalArgumentException("Você não tem acesso administrativo para essa operação");
		}
		produtos.add(produto);
	}
	
	public void excluirProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public void atualizarEstoque(Produto produto, int quantidade) {
		produto.entrada(quantidade);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public String exportarRelatorio() {
		StringBuilder sb = new StringBuilder();
		sb.append("Relatório:\n");
		for (Produto produto : produtos) {
            	sb.append("Nome: ").append(produto.getNome()).append("\n");
            	sb.append("Descrição: ").append(produto.getDescricao()).append("\n");
            	sb.append("Quantidade: ").append(produto.getQuantidade()).append("\n");
            	sb.append("Preço: ").append(produto.getPreco()).append("\n");
            	sb.append("Validade: ").append(produto.getValidade()).append("\n");
            	sb.append("-----------------------\n");
        	}
        return sb.toString();
	}
}
