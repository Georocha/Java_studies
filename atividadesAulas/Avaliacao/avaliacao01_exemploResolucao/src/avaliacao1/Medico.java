package avaliacao1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Medico extends Pessoa {

	private String crm;

	private String endereco;

	private String telefoneCelular;
	
	private Collection<Bebe> bebes = new ArrayList<Bebe>(); 
	
	public Medico(String nome, Date dataNascimento, String crm, String endereco, String telefoneCelular) {
		super(nome, dataNascimento);
		setCrm(crm);
		setEndereco(endereco);
		setTelefoneCelular(telefoneCelular);
	}
	
	public Medico(String nome, Date dataNascimento, String crm, String endereco, String telefoneCelular, Collection<Bebe> bebes) {
		this(nome, dataNascimento, crm, endereco, telefoneCelular);
		setBebes(bebes);
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String toString() {
		return super.toString() + " - CRM:" + getCrm() + " - Endereco:" + getEndereco() + " - Telefone Celular: " + getTelefoneCelular();
	}

	public Collection<Bebe> getBebes() {
		return bebes;
	}

	public void setBebes(Collection<Bebe> bebes) {
		this.bebes = bebes;
	}

	@Override
	public boolean equals(Object obj) {
		boolean eIgual = false;
		if (obj instanceof Medico) {
			Medico m = (Medico) obj;
			if (m.getCrm().equals(this.getCrm())) {
			  eIgual = true;
			}
		}
		return eIgual;
	}
	
	
}