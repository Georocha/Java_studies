package estudoDirigido1;

public class Pessoas {

	private int codPessoa;
	private String nomeCompleto, endereco, email, telefone;
	
	public Pessoas(int codPessoa, String nomeCompleto, String endereco, String email, String telefone) {
		super();
		this.codPessoa = codPessoa;
		this.nomeCompleto = nomeCompleto;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	public Pessoas() {
		
	}
	
	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "* Código:  " + getCodPessoa() 
        + "\nNome Completo: " + getNomeCompleto()
        + "\nEndereço:  " + getEndereco()
        + "\nEmail:  " + getEmail()
        + "\nTelefone:  " + getTelefone()
        + " * ";
	}
	
}
