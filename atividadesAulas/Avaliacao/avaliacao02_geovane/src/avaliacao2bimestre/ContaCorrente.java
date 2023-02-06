package avaliacao2bimestre;

public class ContaCorrente extends Conta {
	
	private int taxaMovimentacao;

	public ContaCorrente(int numero, int saldo, int taxaMovimentacao) {
		super(numero, saldo);
		this.taxaMovimentacao = taxaMovimentacao;
	}

	public int getTaxaMovimentacao() {
		return taxaMovimentacao;
	}

	public void setTaxaMovimentacao(int taxaMovimentacao) {
		this.taxaMovimentacao = taxaMovimentacao;
	}
	
	
}
