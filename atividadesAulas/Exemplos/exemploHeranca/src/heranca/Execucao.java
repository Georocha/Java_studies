package heranca;

import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class Execucao {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in); 
			Collection<Professor> professores = new ArrayList<Professor>();
			System.out.println("Desejar incluir um novo professor (0=Não e 1=Sim):");
			int opcao = sc.nextInt();
			while (opcao == 1) {
				System.out.println("Inserindo um professor:");
				System.out.println("Informe se o professor é DE(1) ou Horista(2):");
				int tipoProfessor = sc.nextInt();
				System.out.println("Matrícula:");
				int matricula = sc.nextInt();
				System.out.println("Nome:");
				String nome = sc.next();
				Professor professor;
				if (tipoProfessor == 1) {
					System.out.println("Salário:");
					double salario = sc.nextDouble();
					professor = new ProfessorDE(matricula,nome,salario);					
				} else {
					System.out.println("Carga Horária:");
					int cargaHoraria = sc.nextInt();
					System.out.println("Salário Hora:");
					double salarioHora = sc.nextDouble();
					professor = new ProfessorHorista(matricula,nome,cargaHoraria,salarioHora);	
				}
				professores.add(professor);
				System.out.println("Desejar incluir um novo professor (0=Não e 1=Sim):");
				opcao = sc.nextInt();
			}
			if (opcao != 1) {
				System.out.println("Encerrando as inserções de professores");
			}
			imprimirProfessores(professores);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void imprimirProfessores(Collection<Professor> professores) {
	  for (Professor professor : professores) {
		if (professor instanceof ProfessorDE) {
		  ProfessorDE professorDE = (ProfessorDE) professor;
		  System.out.println(professorDE.toString());
		} else {
		  ProfessorHorista professorHorista = (ProfessorHorista) professor;
		  System.out.println(professorHorista.toString());
			}
		}
	}
}
