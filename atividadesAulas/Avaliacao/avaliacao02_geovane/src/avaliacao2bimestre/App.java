package avaliacao2bimestre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class App {
	
	public static Collection<Correntista> correntistas = new ArrayList<Correntista>();
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----- Itabaiana Bank -----");
		System.out.println("--------------------------");
		System.out.println("Digite a sua opção: \n"
				+ "1 - Cadastrar Correntista \n"
				+ "2 - Efetuar Login \n"
				+ "3 - Debitar Conta \n"
				+ "4 - Creditar Conta \n"
				+ "5 - Exibir Saldo das Contas \n"
				+ "9 - Sair \n"
				+ ">> Digite aqui: ");
		System.out.println("--------------------------");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		
		case 1:
			cadastrarCorrentista();
			break;
		case 2:
			//efetuarLogin();
			//break
		case 3:
			//debitarConta();
			//break
		case 4:
			//creditarConta();
		case 5:
			//exibirSaldoConta();
			//break
		case 9:
			System.exit(0);
			
		}//end switch
		
	}//end main
	
	public static void cadastrarCorrentista( ) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- Cadastro de correntista ---");
		System.out.println("-------------------------------");
		System.out.println("Qual o tipo de conta? [1] Física | [2] Jurídica");
		System.out.println(">> Digite o número da sua opção: ");
		
		int opcaoContaCadastro = entrada.nextInt();
		
		switch(opcaoContaCadastro) {
		
		case 1:
			
			System.out.println("--- Cadastro Correntista Físico");
			System.out.println("Digite o código: ");
			int codigoFisico = entrada.nextInt();
			
			System.out.println("Digite o seu nome: ");
			String nomeFisico = entrada.nextLine();
			System.out.println("Digite o seu telefone: ");
			String telefoneFisico = entrada.nextLine();
			System.out.println("Digite o seu CPF: ");
			double cpfFisico = entrada.nextInt();
			System.out.println("Digite uma senha: ");
			double senhaFisico = entrada.nextInt();
			
			
			CorrentistaFisico clienteCpf = new CorrentistaFisico(codigoFisico, nomeFisico, telefoneFisico,senhaFisico, cpfFisico);
			break;
			
		case 2:
			
			System.out.println("--- Cadastro Correntista Jurídico");
			System.out.println("Digite o código: ");
			int codigoJuridico = entrada.nextInt();
			
			System.out.println("Digite o seu nome: ");
			String nomeJuridico = entrada.nextLine();
			System.out.println("Digite o seu telefone: ");
			String telefoneJuridico = entrada.nextLine();
			System.out.println("Digite o seu CNPJ: ");
			double cnpjJuridico = entrada.nextInt();
			System.out.println("Digite uma senha: ");
			int senhaJuridico = entrada.nextInt();
			
			CorrentistaJuridico clienteCNPJ = new CorrentistaJuridico(codigoJuridico, nomeJuridico, telefoneJuridico, senhaJuridico, cnpjJuridico);
			break;
			
		}//end switch
		
		
	}//end cadastrarCorrentista()
}
