package br.com.projetofinal.biblioteca;

public class Livro {

	private String codigoLivro;
	private String titulo;
	private String editora;
	private String autor;
	private String edicao;
	private String anoPublicacao;
	
	public Livro(String codigoLivro, String titulo, String editora, String autor, String edicao, String anoPublicacao) {
		super();
		setCodigoLivro(codigoLivro);
		setTitulo(titulo);
		setEditora(editora);
		setAutor(autor);
		setEdicao(edicao);
		setAnoPublicacao(anoPublicacao);
	}
	
	public String getCodigoLivro() {
		return codigoLivro;
	}
	public void setCodigoLivro(String codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "|Código: " + getCodigoLivro() + " |Título: " + getTitulo() + " |Editora: " + getEditora() + "|Autores: " + getAutor() + " |Edição: " + getEdicao() + " |Ano de publicação: " + getAnoPublicacao();
	}
	
	
}
