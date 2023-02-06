package avaliacao2bimestre;

public class ContaPoupanca extends Conta {

	private int taxaVariacao;
	private int diaVariacao;
	
	public ContaPoupanca(int numero, int saldo, int taxaVariacao, int diaVariacao) {
		super(numero, saldo);
		this.taxaVariacao = taxaVariacao;
		this.diaVariacao = diaVariacao;
	}

	public int getTaxaVariacao() {
		return taxaVariacao;
	}

	public void setTaxaVariacao(int taxaVariacao) {
		this.taxaVariacao = taxaVariacao;
	}

	public int getDiaVariacao() {
		return diaVariacao;
	}

	public void setDiaVariacao(int diaVariacao) {
		this.diaVariacao = diaVariacao;
	}
	
	
}
