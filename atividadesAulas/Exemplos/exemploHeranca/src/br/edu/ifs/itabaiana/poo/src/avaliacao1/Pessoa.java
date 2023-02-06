package avaliacao1;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	
	private Date dataNascimento;
	
	public Pessoa(String nome, Date dataNascimento) {
		setNome(nome);
		setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " - Data de Nascimento:" + getDataNascimentoFormatada();
	}
	
	public String getDataNascimentoFormatada() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(getDataNascimento());
	}

	@Override
	public boolean equals(Object obj) {
		boolean eIgual = false;
		if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;
			if (p.getNome().equals(this.getNome())) {
			  eIgual = true;
			}
		}
		return eIgual;
	}
}