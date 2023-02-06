package avaliacao01_geovane;

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Collection<Medicamento> listaMedicamentos = new ArrayList<Medicamento>();
		Collection<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		int opcao = -1;
		while (opcao != 9) {
			imprimeMenu();
			int escolha = entrada.nextInt();
			
			switch (escolha) {
			case 1:
				
				Medicamento medicamento = new Medicamento();
				
				System.out.println("----- Incluindo Medicamento -----");
				System.out.println("Preencha os campos abaixo: ");
				System.out.println("Descrição: ");
				medicamento.setDescricao(entrada.next());
				System.out.println("Quantidade em estoque: ");
				medicamento.setQuantidadeEmEstoque(entrada.nextInt());
				System.out.println("Unidade de medida: ");
				medicamento.setUnidadeMedida(entrada.next());
				
				listaMedicamentos.add(medicamento);
				
				System.out.println("Medicamento inserido com sucesso. ");
				break;
				
			case 2:
				
				Mae mae = new Mae();
				
				System.out.println("----- Incluindo Mae -----");
				System.out.println("Preencha os campos abaixo: ");
				System.out.println("Nome: ");
				mae.setNome(entrada.next());
				System.out.println("Sobrenome: ");
				mae.setSobrenome(entrada.next());
				System.out.println("Data de nascimento: ");
				mae.setDataNascimento(entrada.next());
				System.out.println("Endereco: ");
				mae.setEndereco(entrada.next());
				System.out.println("Telefone: ");
				mae.setTelefone(entrada.next());
				
				listaPessoas.add(mae);
				
				System.out.println("incluido mãe com sucesso. ");
				break;
				
			case 3:
				
				Medico medico = new Medico();
				
				System.out.println("----- Incluindo Medico -----");
				System.out.println("Preencha os campos abaixo: ");
				System.out.println("Nome: ");
				medico.setNome(entrada.next());
				System.out.println("Data de nascimento: ");
				medico.setDataNascimento(entrada.next());
				System.out.println("CRM (Conselho Regional de Medicina): ");
				medico.setCrm(entrada.nextInt());
				System.out.println("Endereco: ");
				medico.setEndereco(entrada.next());
				System.out.println("Telefone Celular: ");
				medico.setTelefoneCelular(entrada.next());
				
				listaPessoas.add(medico);
				
				System.out.println("incluido medico com sucesso. ");
				break;
				
			case 4:
				
				Bebe bebe = new Bebe();
				System.out.println("----- Incluindo bebe -----");
				System.out.println("Preencha os campos abaixo: ");
				System.out.println("Nome: ");
				bebe.setNome(entrada.next());
				System.out.println("Data de nascimento: ");
				bebe.setDataNascimento(entrada.next());
				
				listaPessoas.add(bebe);
				
				System.out.println("incluido bebe com sucesso. ");
				break;
				
			case 5:
				System.out.println("Listar medicamentos cadastrados");
				System.out.println(listaMedicamentos.toString());
				break;
				
			case 6:
				
				System.out.println("Listar pessosas cadastradas");
				System.out.println(listaPessoas.toString());
				break;
				
			case 9:
				
				System.out.println("Sair");
				opcao = 9;
				System.out.println("Encerrando...");
				break;
			
			default:
				break;
			}
			imprimeMenu();
		}
		entrada.close();
	}
	
	public static void imprimeMenu( ) {
		
		System.out.println("Clinica PMI do Bebe");
		System.out.println("Digite a sua opcao:\n"
				+ "\n1 - Incluir um Medicamento"
				+ "\n2 - Incluir uma Mae"
				+ "\n3 - Incluir um Medico"
				+ "\n4 - Incluir um Bebe"
				+ "\n5 - Listar medicamentos cadastrados"
				+ "\n6 - Listar pessoas cadastradas"
				+ "\n9 - Sair"
				
				);
		
	}

}
