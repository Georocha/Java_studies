package br.com.projetofinal.biblioteca;

public class Exemplar extends Livro {

	private String codigoExemplar;
	private boolean statusDeDisponibilidade = true;
	
	public Exemplar(String codigoLivro, String titulo, String editora, String autor, String edicao,
			String anoPublicacao, String codigoExemplar, boolean statusDeDisponibilidade) {
		super(codigoLivro, titulo, editora, autor, edicao, anoPublicacao);
		setCodigoExemplar(codigoExemplar);
		setStatusDeDisponibilidade(statusDeDisponibilidade);
	}
	
	public String getCodigoExemplar() {
		return codigoExemplar;
	}
	
	public void setCodigoExemplar(String codigoExemplar) {
		this.codigoExemplar = codigoExemplar;
	}

	public boolean isStatusDeDisponibilidade() {
		return statusDeDisponibilidade;
	}

	public void setStatusDeDisponibilidade(boolean statusDeDisponibilidade) {
		this.statusDeDisponibilidade = statusDeDisponibilidade;
	}
	
}
