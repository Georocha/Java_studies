package br.com.projetofinal.biblioteca;

public class Usuario {
	
	private String codigo;
	private String tipoUsuario;
	private String nome;
	public boolean devedor;
	
	public Usuario(String codigo, String tipoUsuario, String nome) {
		setCodigo(codigo);
		setTipoUsuario(tipoUsuario);
		setNome(nome);
	}
	public Usuario() {
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isDevedor() {
		return devedor;
	}

	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}

	@Override
	public boolean equals(Object codusu) {
		
		boolean codigoIgual = false;
		
		if (codusu instanceof Usuario) {
			Usuario usu = (Usuario) codusu;
			if (usu.getCodigo().equals(getCodigo())) {
				codigoIgual = true;
			}
		}
		return codigoIgual;
	}

	@Override
	public String toString() {
		return "Código do usuário: " + getCodigo() + " Tipo do usuário: " + getTipoUsuario() + " Nome: " + getNome();
	}
	
	/*public boolean devedor() {
		boolean retorno = false;
		if (emprestimos.size() > 3) {
			for (devedor emprestimo: emprestimo)
		}
		return retorno;
	}*/
	
	
}
