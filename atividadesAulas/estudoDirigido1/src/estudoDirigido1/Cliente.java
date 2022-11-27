package estudoDirigido1;

public class Cliente extends Pessoas {

	private int codPlanoAtend;
	private String comoConheceuEmpresa;
	
	public Cliente(int codPessoa, String nomeCompleto, String endereco, String email, String telefone,
			int codPlanoAtend, String comoConheceuEmpresa) {
		super(codPessoa, nomeCompleto, endereco, email, telefone);
		this.codPlanoAtend = codPlanoAtend;
		this.comoConheceuEmpresa = comoConheceuEmpresa;
	}
	
	public Cliente() {
		
	}
	
	public int getCodPlanoAtend() {
		return codPlanoAtend;
	}

	public void setCodPlanoAtend(int codPlanoAtend) {
		this.codPlanoAtend = codPlanoAtend;
	}

	public String getComoConheceuEmpresa() {
		return comoConheceuEmpresa;
	}

	public void setComoConheceuEmpresa(String comoConheceuEmpresa) {
		this.comoConheceuEmpresa = comoConheceuEmpresa;
	}
	
}
