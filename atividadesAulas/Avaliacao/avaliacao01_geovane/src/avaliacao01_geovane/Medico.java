package avaliacao01_geovane;

public class Medico extends Pessoa {

	private int crm;
	private String endereco;
	private String telefoneCelular;
	
	public Medico(String nome, String dataNascimento, int crm, String endereco, String telefoneCelular) {
		super(nome, dataNascimento);
		this.crm = crm;
		this.endereco = endereco;
		this.telefoneCelular = telefoneCelular;
	}

	public Medico() {
		
	}
	
	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	
	
	
	
}
