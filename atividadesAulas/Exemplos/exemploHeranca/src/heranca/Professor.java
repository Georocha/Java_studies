package heranca;

public abstract class Professor {
	
	protected int matricula;
	
	protected String nome;
	
	protected int cargaHoraria;
	
	public Professor(int matricula, String nome, int cargaHoraria) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public boolean equals(Object obj) {
		boolean retorno = false;
		if (obj instanceof Professor) {
			Professor p = (Professor) obj;
			retorno = matricula == p.matricula;
		}
		return retorno;
	}
}