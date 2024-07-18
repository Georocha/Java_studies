package model;

public class Funcionario extends Usuario {
	
	public Funcionario(String nome, String login, String senha) {
		super(nome, login, senha);
	}

	@Override
	public String nivelDeAcesso() {
		// TODO Auto-generated method stub
		return "Funcionario";
	}
	
	public void consultarEstoque(Produto produto) {
		// TODO 
	}

	public void cadastrarProduto(Produto produto) {
		// TODO Auto-generated method stub
	}
	
}
