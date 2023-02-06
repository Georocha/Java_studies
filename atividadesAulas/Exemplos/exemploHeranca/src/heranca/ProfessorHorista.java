package heranca;

public class ProfessorHorista extends Professor {
	
	private double salarioHora;

	public ProfessorHorista(int m,String n, int c, double s) {
		super(m,n,c);
		this.salarioHora = s;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	public String toString() {
		return "[ProfessorHorista] " + getMatricula() 
        + " - " + getNome()
        + " - " + getCargaHoraria()
        + " - " + getSalarioHora();
	}
}
