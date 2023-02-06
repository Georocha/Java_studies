package heranca;

public class ProfessorDE extends Professor {
	
	private double salario;
	
	public ProfessorDE(int m, String n, double s) {
		super(m,n,40);
		this.salario = s;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "[ProfessorDE] " + getMatricula() 
        + " - " + getNome()
        + " - " + getCargaHoraria()
        + " - " + getSalario();
	}
	
	
}
