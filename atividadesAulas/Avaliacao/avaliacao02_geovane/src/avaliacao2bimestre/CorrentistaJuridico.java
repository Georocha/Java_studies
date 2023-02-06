package avaliacao2bimestre;

public class CorrentistaJuridico extends Correntista {
	
	private double cnpj;

	public CorrentistaJuridico(int codigo, String nome, String telefone, double senha, double cnpj) {
		super(codigo, nome, telefone, senha);
		this.cnpj = cnpj;
	}

	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}
	
}
