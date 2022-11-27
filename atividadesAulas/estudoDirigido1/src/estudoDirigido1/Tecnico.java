package estudoDirigido1;

public class Tecnico extends Pessoas {

	private int regimeContratacao;
	private String certificacoes;
	
	public Tecnico(int codPessoa, String nomeCompleto, String endereco, String email, String telefone,
			int regimeContratacao, String certificacoes) {
		super(codPessoa, nomeCompleto, endereco, email, telefone);
		this.regimeContratacao = regimeContratacao;
		this.certificacoes = certificacoes;
	}
	
	public Tecnico() {
		
	}
	
	public int getRegimeContratacao() {
		return regimeContratacao;
	}

	public void setRegimeContratacao(int regimeContratacao) {
		this.regimeContratacao = regimeContratacao;
	}

	public String getCertificacoes() {
		return certificacoes;
	}

	public void setCertificacoes(String certificacoes) {
		this.certificacoes = certificacoes;
	}
	
}
