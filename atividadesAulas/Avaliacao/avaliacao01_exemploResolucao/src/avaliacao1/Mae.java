package avaliacao1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Mae extends Pessoa {
	
	private String sobrenome;
	
	private String endereco;
	
	private String telefone;
	
	private Collection<Bebe> bebes = new ArrayList<Bebe>();

	public Mae(String nome, Date dataNascimento, String sobrenome, String endereco, String telefone) {
		super(nome, dataNascimento);
		setSobrenome(sobrenome);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	public Mae(String nome, Date dataNascimento, String sobrenome, String endereco, String telefone, Collection<Bebe> bebes) {
		this(nome, dataNascimento, sobrenome, endereco, telefone);
		setBebes(bebes);
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return super.toString() + " - Sobrenome:" + getSobrenome() + " - Endereço:" + getEndereco() + " - Telefone:" + getTelefone();
	}

	public Collection<Bebe> getBebes() {
		return bebes;
	}

	public void setBebes(Collection<Bebe> bebes) {
		this.bebes = bebes;
	}
}
