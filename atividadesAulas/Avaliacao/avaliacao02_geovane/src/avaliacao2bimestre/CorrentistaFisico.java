package avaliacao2bimestre;

public class CorrentistaFisico extends Correntista {
	
	private double cpf;

	public CorrentistaFisico(int codigo, String nome, String telefone, double senha, double cpf) {
		super(codigo, nome, telefone, senha);
		this.cpf = cpf;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	
}
