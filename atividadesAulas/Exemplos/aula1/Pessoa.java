package br.edu.ifs.itabaiana.poo.aula1;

import java.util.Date;

public class Pessoa extends Object {
	
	private String cpf;
	
	private Date dataNascimento; 
	
	private Date dataRenovacaoCNH;
	
	private String nome;
	
	protected boolean doadorOrgaos;
	
	public Pessoa() {
		
	}
	
    public Pessoa(String cpf, Date dataNascimento, Date dataRenovacaoCNH, String nome, boolean doadorOrgaos) {
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setDataRenovacaoCNH(dataRenovacaoCNH);
		setDoadorOrgaos(doadorOrgaos);
		setNome(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataRenovacaoCNH() {
		return dataRenovacaoCNH;
	}

	public void setDataRenovacaoCNH(Date dataRenovacaoCNH) {
		this.dataRenovacaoCNH = dataRenovacaoCNH;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isDoadorOrgaos() {
		return doadorOrgaos;
	}

	public void setDoadorOrgaos(boolean doadorOrgaos) {
		this.doadorOrgaos = doadorOrgaos;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", dataRenovacaoCNH=" + dataRenovacaoCNH
				+ ", nome=" + nome + ", doadorOrgaos=" + doadorOrgaos + "]" + super.toString();
	}
	
	

}
