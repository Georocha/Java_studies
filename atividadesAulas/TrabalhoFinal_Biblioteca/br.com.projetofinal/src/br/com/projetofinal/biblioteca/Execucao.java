package br.com.projetofinal.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Execucao {
	
	public static Collection<Usuario> usuarios = new ArrayList<Usuario>();
	public static Collection<Livro> livros = new ArrayList<Livro>();
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		while(true) {

			System.out.println("\n:: Biblioteca ::\n");
			System.out.println(" Instruções de uso:"
					+ "\n Cadastro de usuários: comando 'usu' + 'codigo usuário' + 'add' + 'tipo usuario' + 'nome usuario' Ex: usu-200-add-pro-João Santos "
					+ "\n Empréstimo de livros: comando 'emp' + 'codigo do usuário' + 'código do livro' Ex: emp-123-100 "
					+ "\n Devolução de livros: comando 'dev' + 'codigo do usuário' + 'código do livro' Ex: dev-123-401"
					+ "\n Consultas:"
					+ "\n Consultar todos os livros: comando 'liv' + '-' + '*' Ex: liv-*"
					+ "\n Consultar livro na íntegra: comando 'liv' + '-' + 'código do livro' Ex: liv-401 "
					+ "\n Consultar Usuário na íntegra: comando 'usu' + '-' + 'código do usuário' Ex: usu-200"
					+ "\n");
			System.out.println(" Menu de comandos: \n");
			System.out.println(" usu   - Cadastrar usuário");
			System.out.println(" emp   - Emprestar livros");
			System.out.println(" dev   - Devolver livros");
			System.out.println(" liv-* - Consultar livros cadastrados");
			System.out.println(" liv-[códigoLivro]   - Empréstimos");
			System.out.println(" usu-[códigoUsuário] - Multas");
			System.out.println(" sair\n");
			System.out.println(">> Digite o comando desejado: ");

			String opcao = entrada.nextLine();
			String[] opcaoSplit = opcao.split("-");
			
			switch (opcaoSplit[0]) {
			
			case "usu":
				cadastrarUsuario(opcaoSplit);
				break;
			case "emp":
				emprestarLivro(opcaoSplit);
				break;
			case "dev":
				//devolverLivro();
				break;
			case "liv":
				consultas(opcaoSplit);
				break;
			case "sair":
				System.out.println("");
				System.out.println("Até a próxima visita!");
				System.exit(0);
			default:
				System.out.println("Opção inválida! tente novamente.");
			
			} //end switch
		} //end while
	} //main
	
	private static void cadastrarUsuario(String[] opcaoSplit) {
		Scanner entrada = new Scanner(System.in);
		
		String codigoUsuario = opcaoSplit[1];
		String tipoUsuario = opcaoSplit[3];
		String nomeUsuario = opcaoSplit[4];
		
		Usuario usu = new Usuario(codigoUsuario, tipoUsuario, nomeUsuario);
		
		if (codigoUsuarioJaExiste(usu)) {
			System.out.println("Código de usuário inválido");
		} else {
			usuarios.add(usu);
		}
		
		/*System.out.println("Lista usuários");
		if (usuarios.isEmpty()) {
			System.out.println("Não há usuários cadastrados!");
		} else {
			for (Usuario usuario: usuarios) {
				System.out.println(usuario);
			}
		}*/
		
	}
	
	private static boolean codigoUsuarioJaExiste(Usuario usu) {
		if (usuarios.contains(usu)) {
			return true;
		}
		return false;
	}

	private static void emprestarLivro(String[] opcaoSplit) {
		Scanner entrada = new Scanner(System.in);
		
		String codigoUsuario = opcaoSplit[1];
		String codigoLivro = opcaoSplit[2];
		
	}
	
	private static void consultas(String[] opcaoSplit) {
		
		switch (opcaoSplit[1]) {
		case "*":
			listaLivrosCadastrados();
		
			
		}
		
	}
	
	private static void cadastrarLivros() {
		
		Livro livro1 = new Livro("100","Engenharia de Software", "Addison-Wesley", "Ian Sommerville", "6","2000");
		Livro livro2 = new Livro("101","UML-Guia do Usuário","Campus","Grady Booch, James Rumbaugh, Ivar Jacobson","7","2000");
		Livro livro3 = new Livro("200","Code Complete","Microsoft","Steve McConnell","2","2014");
		Livro livro4 = new Livro("201","Agile Software Development, Principles, Patterns and Practices","Prentice Hall","Robert Martin","1","2002");
		Livro livro5 = new Livro("300","Refactoring: Improving the Design of Existing Code","Addison-Wesley Professional","Martin Fowler","1","1999");
		Livro livro6 = new Livro("301", "Software Metrics:A Rigorous and Practical Approach","CRC Press", "Norman Fenton, James Bieman", "3","2014");
		Livro livro7 = new Livro("400","Design Patterns: Elements of Reusable Object-Oriented Software","Addison-Wesley Professional","Erich Gamma, Richard Helm, Raph Jhonson, John Vlissides","1","1994");
		Livro livro8 = new Livro("401","UML Distilled: A brief Guide to the standard Object Modeling Language","Addison-Wesley Professional", "Martin Fowler","3","2003");
		
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		livros.add(livro4);
		livros.add(livro5);
		livros.add(livro6);
		livros.add(livro7);
		livros.add(livro8);
		
	}
	private static void listaLivrosCadastrados() {
		
		cadastrarLivros();
		
		System.out.println("----- Livros cadastrados ----");
		System.out.println("-----------------------------");
		for (Livro livro: livros) {
			System.out.println(livro);
		}
		System.out.println("-----------------------------");
	}
}