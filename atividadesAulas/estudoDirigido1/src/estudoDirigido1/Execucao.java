package estudoDirigido1;

import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Collection<Pessoas> pessoasCadastradas = new ArrayList<Pessoas>();
		
		System.out.println("Service Desk LTDA");
		System.out.println("Entrar - 0 | Sair - 9");
		int opcao = entrada.nextInt();
		
		while (opcao == 0) {
			
			System.out.println("Menu");
			System.out.println("Digite a sua opção:");
			System.out.println("\n1 - Incluir uma pessoa "
					+ "\n2 - Incluir um cliente "
					+ "\n3 - Incluir um atendente "
					+ "\n4 - Incluir um técnico"
					+ "\n5 - Listar pessoas cadastradas"
					+ "\n9 - Sair");
			
			int escolha = entrada.nextInt();
			
			switch (escolha) {
			
			case 1:
				
				Pessoas pessoa = new Pessoas();
				
				System.out.println("Preencha os campos: ");
				System.out.println("Código: ");
				pessoa.setCodPessoa(entrada.nextInt());
				System.out.println("Nome completo: ");
				pessoa.setNomeCompleto(entrada.next());;
				System.out.println("Endereço: ");
				pessoa.setEndereco(entrada.next());
				System.out.println("Email: ");
				pessoa.setEmail(entrada.next());
				System.out.println("Telefone: ");
				pessoa.setTelefone(entrada.next());
				
				pessoasCadastradas.add(pessoa);
				
				System.out.println("Incluido pessoa com sucesso!");
				break;
				
			case 2:
				
				Cliente cliente = new Cliente();
				
				System.out.println("Preencha os campos: ");
				System.out.println("Código: ");
				cliente.setCodPessoa(entrada.nextInt());
				System.out.println("Nome completo: ");
				cliente.setNomeCompleto(entrada.next());;
				System.out.println("Endereço: ");
				cliente.setEndereco(entrada.next());
				System.out.println("Email: ");
				cliente.setEmail(entrada.next());
				System.out.println("Telefone: ");
				cliente.setTelefone(entrada.next());
				System.out.println("Plano de atendimento: 1 = servive desk local | 2 = service desk virtual");
				cliente.setCodPlanoAtend(entrada.nextInt());
				System.out.println("Como conheceu a empresa: ");
				cliente.setComoConheceuEmpresa(entrada.next());
				
				pessoasCadastradas.add(cliente);
			
				System.out.println("Incluído cliente com sucesso!");
				break;
				
			case 3:
				
				Atendente atendente = new Atendente();

				System.out.println("Preencha os campos: ");
				System.out.println("Código: ");
				atendente.setCodPessoa(entrada.nextInt());
				System.out.println("Nome completo: ");
				atendente.setNomeCompleto(entrada.next());;
				System.out.println("Endereço: ");
				atendente.setEndereco(entrada.next());
				System.out.println("Email: ");
				atendente.setEmail(entrada.next());
				System.out.println("Telefone: ");
				atendente.setTelefone(entrada.next());
				System.out.println("Área de atendimento e suporte: 1=hardware | 2=software | 3=hardware e software");
				atendente.setAreaAtendSuporte(entrada.nextInt());
				System.out.println("Servico de atendimento ao cliente");
				atendente.setServAtendimento(entrada.next());
				
				pessoasCadastradas.add(atendente);
				System.out.println("Incluído atendente com sucesso!");
				break;
				
			case 4:
				
				Tecnico tecnico = new Tecnico();
				
				System.out.println("Preencha os campos: ");
				System.out.println("Código: ");
				tecnico.setCodPessoa(entrada.nextInt());
				System.out.println("Nome completo: ");
				tecnico.setNomeCompleto(entrada.next());;
				System.out.println("Endereço: ");
				tecnico.setEndereco(entrada.next());
				System.out.println("Email: ");
				tecnico.setEmail(entrada.next());
				System.out.println("Telefone: ");
				tecnico.setTelefone(entrada.next());
				System.out.println("Regime de contratação: 1 = CLT | 2 = PJ");
				tecnico.setRegimeContratacao(entrada.nextInt());
				System.out.println("Certificações: ");
				tecnico.setCertificacoes(entrada.next());
				
				pessoasCadastradas.add(tecnico);
				
				System.out.println("Incluído técnico com sucesso!");
				break;
				
			case 5:
				System.out.println(pessoasCadastradas.toString());
				break;
			case 9:
				System.out.println("Saindo do programa....");
				opcao = 9;
			default:
				break;
			} // end switch
			
		} //end while
		
		if (opcao == 9) {
			System.out.println("Programa encerrado.");
		} else if (opcao != 0 && opcao != 9){
			System.out.println("Comando inválido.");
		}
		
		entrada.close();
	} // end main
	
	
}
