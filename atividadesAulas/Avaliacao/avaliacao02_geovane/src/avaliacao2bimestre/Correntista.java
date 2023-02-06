package avaliacao2bimestre;

public class Correntista {

	private int codigo;
	private String nome;
	private String telefone;
	private boolean estaLogado = false;
	private double senha;
	Conta conta;
	
	public Correntista(int codigo, String nome, String telefone, double senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.senha = senha;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isEstaLogado() {
		return estaLogado;
	}

	public void setEstaLogado(boolean estaLogado) {
		this.estaLogado = estaLogado;
	}

	public double getSenha() {
		return senha;
	}

	public void setSenha(double senha) {
		this.senha = senha;
	}


	
}
