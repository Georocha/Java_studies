package br.edu.ifs.itabaiana.poo.aula1;

public abstract class Conta {
	
	private double saldo;
	
	public abstract boolean deposito(double valor);
	
	public abstract boolean saque(double valor);
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}

}
