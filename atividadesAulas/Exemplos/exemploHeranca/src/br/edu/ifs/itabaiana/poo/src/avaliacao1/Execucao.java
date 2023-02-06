package avaliacao1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Execucao {

	public static Collection<Medicamento> medicamentos = new ArrayList<Medicamento>();

	public static Collection<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		System.out.println("Programa de Controle da Clínica PMI do Bebê");
		while (opcao != 9) {
			System.out.println("Informe a opção desejada:");
			System.out.println("1 - Incluir um Medicamento.");
			System.out.println("2 - Incluir uma Mãe.");
			System.out.println("3 - Incluir um Médico.");
			System.out.println("4 - Incluir um Bebê.");
			System.out.println("5 - Listar Medicamentos cadastrados.");
			System.out.println("6 - Listar Pessoas cadastradas.");
			System.out.println("9 - Sair.");
			Scanner sc = new Scanner(System.in);
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				incluirMedicamento();
				break;
			case 2:
				incluirMae();
				break;
			case 3:
				incluirMedico();
				break;
			case 4:
				incluirBebe();
				break;
			case 5:
				listarMedicamentos();
				break;
			case 6:
				listarPessoas();
				break;
			case 9:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			System.out.println("");
		}
	}

	private static void incluirMedicamento() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" === Incluir Medicamento ===");
		System.out.println("Digite a sua descrição:");
		String descricao = sc.nextLine();
		System.out.println("Digite a quantidade em estoque:");
		int qtEstoque = sc.nextInt();
		System.out.println("Digite a unidade de medida:");
		String unidadeMedida = sc.next();
		Medicamento medicamento = new Medicamento(descricao, qtEstoque, unidadeMedida);
		medicamentos.add(medicamento);
		System.out.println("Medicamento cadastrado com sucesso!");
	}

	private static void incluirMae() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" === Incluir Mãe ===");
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
		Date dataNascimento = transformarDataTexto(sc.nextLine());
		if (dataNascimento != null) {
			System.out.println("Digite o sobrenome:");
			String sobrenome = sc.nextLine();
			System.out.println("Digite o endereço:");
			String endereco = sc.nextLine();
			System.out.println("Digite o telefone:");
			String telefone = sc.nextLine();
			Mae mae = new Mae(nome, dataNascimento, sobrenome, endereco, telefone);
			pessoas.add(mae);
			System.out.println("Mãe cadastrada com sucesso!");
		}
	}

	private static void incluirMedico() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" === Incluir Médico ===");
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
		Date dataNascimento = transformarDataTexto(sc.nextLine());
		if (dataNascimento != null) {
			System.out.println("Digite o CRM:");
			String crm = sc.nextLine();
			System.out.println("Digite o endereço:");
			String endereco = sc.nextLine();
			System.out.println("Digite o telefone celular:");
			String telefoneCelular = sc.nextLine();
			Medico medico = new Medico(nome, dataNascimento, crm, endereco, telefoneCelular);
			pessoas.add(medico);
			System.out.println("Médico cadastrado com sucesso!");
		}
	}

	private static void incluirBebe() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" === Incluir Bebe ===");
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
		Date dataNascimento = transformarDataTexto(sc.nextLine());
		if (dataNascimento != null) {
			System.out.println("Digite o nome da Mãe:");
			String nomeMae = sc.nextLine();
			System.out.println("Digite o CRM do Médico:");
			String crmMedico = sc.nextLine();
			boolean houveErro = false;
			Mae mae = obterMaeColecao(nomeMae);
			if (mae == null) {
				System.out.println("Mãe não encontrada! Inclua a mãe antes de inserir o Bebê.");
				houveErro = true;
			}
			Medico medico = obterMedicoColecao(crmMedico);
			if (medico == null) {
				System.out.println("Médico não encontrado! Inclua o médico antes de inserir o Bebê.");
				houveErro = true;
			}
			if (houveErro == false) {
				Bebe bebe = new Bebe(nome, dataNascimento, mae, medico);
				pessoas.add(bebe);
				mae.getBebes().add(bebe);
				medico.getBebes().add(bebe);
				System.out.println("Bebê cadastrado com sucesso!");
			}
		}
	}

	private static Date transformarDataTexto(String dataTexto) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return formatador.parse(dataTexto);
		} catch (ParseException e) {
			System.out.println("Data inválida!");
			return null;
		}
	}

	private static Mae obterMaeColecao(String nomeMae) {
		Mae mae = null;
		Mae m = new Mae(nomeMae, null, null, null, null);
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Mae) {
				Mae maeColecao = (Mae) pessoa;
				if (m.equals(maeColecao)) {
					mae = maeColecao;
					break;
				}
			}
		}
		return mae;
	}

	private static Medico obterMedicoColecao(String crm) {
		Medico medico = null;
		Medico m = new Medico(null, null, crm, null, null);
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Medico) {
				Medico medicoColecao = (Medico) pessoa;
				if (m.equals(medicoColecao)) {
					medico = medicoColecao;
					break;
				}
			}
		}
		return medico;
	}

	private static void listarMedicamentos() {
		System.out.println(" === Listar Medicamentos ===");
		if (medicamentos.isEmpty()) {
			System.out.println("Não há medicamentos cadastrados!");
		} else {
			for (Medicamento medicamento : medicamentos) {
				System.out.println(medicamento);
			}
		}
	}

	private static void listarPessoas() {
		System.out.println(" === Listar Pessoas ===");
		if (pessoas.isEmpty()) {
			System.out.println("Não há pessoas cadastradas!");
		} else {
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa);
			}
		}
	}
}