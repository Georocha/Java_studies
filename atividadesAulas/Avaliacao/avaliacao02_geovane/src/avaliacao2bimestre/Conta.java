package avaliacao2bimestre;

import java.util.Date;

public abstract class Conta {
	
	private int numero;
	private int saldo;
	private Date dataAbertura;
	private Date dataEncerramento = null;
	
	public Conta(int numero, int saldo) {
		super();
		setNumero(numero);
		setSaldo(saldo);
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	
	public void credito(int saldo) {
		
	}
	
	public void debito(int saldo) {
		
	}
}
