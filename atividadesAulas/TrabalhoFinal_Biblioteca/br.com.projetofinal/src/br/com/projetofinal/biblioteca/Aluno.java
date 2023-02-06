package br.com.projetofinal.biblioteca;

public class Aluno extends Usuario {
	
	public final static int TEMPO_LIMTE_DIAS_EMPRESTIMO = 5;
	public final static int LIMTE_EMPRESTIMO_ABERTO = 3;
	
	public Aluno(String codigo, String tipoUsuario, String nome) {
		super(codigo, tipoUsuario, nome);
		// TODO Auto-generated constructor stub
	}
	
	
}
