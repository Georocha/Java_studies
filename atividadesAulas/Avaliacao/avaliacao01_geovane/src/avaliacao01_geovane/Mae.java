package avaliacao01_geovane;

public class Mae extends Pessoa {

	private String sobrenome;
	private String endereco;
	private String telefone;
	
	public Mae(String nome, String dataNascimento, String sobrenome, String endereco, String telefone) {
		super(nome, dataNascimento);
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Mae() {
		
	}
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
