package avaliacao01_geovane;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	
	public Pessoa(String nome, String dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " | Pessoas cadastrada:\n" + " - Nome: " + getNome() + " - Data de nascimento: " + getDataNascimento() + "\n"
		;
	}

	
}
