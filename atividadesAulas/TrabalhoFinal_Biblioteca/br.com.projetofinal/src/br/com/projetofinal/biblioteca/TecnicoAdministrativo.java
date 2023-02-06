package br.com.projetofinal.biblioteca;

public class TecnicoAdministrativo extends Usuario {

	public final static int TEMPO_LIMTE_DIAS_EMPRESTIMO = 14;
	public final static int LIMTE_EMPRESTIMO = 5;
	
	public TecnicoAdministrativo(String codigo, String tipoUsuario, String nome) {
		super(codigo, tipoUsuario, nome);
		
	}
	
	
}
