package atividade3_bancoIta;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	
	private int numeroConta;
	private Cliente titularConta;
	protected double saldo;
    protected  List<Transacao>	transacoes;
    private boolean bloquear;
	
	public Conta(int numeroConta2, Cliente titularConta2) {
		// TODO Auto-generated constructor stub
		setNumeroConta(numeroConta2);
		setTitularConta(titularConta2);
		setTransacoes(new ArrayList<>());
		setBloquear(false);
	}

	public void depositar(double valor) {
		saldo += valor;
		transacoes.add(new Transacao("Depósito", valor));
	}
	
	public abstract void sacar(double valor);
	
	public void transferir(double valor, Conta contaDestino) {
		if (saldo >= valor) {
			saldo -= valor;
			transacoes.add(new Transacao("Transferência", -valor));
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void pagar(double valor) {
		if (valor > 0 && getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			getTransacoes().add(new Transacao("Pagamento", -valor));
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void bloquearConta() {
		bloquear = true;
		System.out.println("Conta bloqueada");
	}
	
	public void desbloquearConta() {
		bloquear = false;
		System.out.println("Conta desbloqueada");
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(Cliente titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
	
	
	public boolean isBloquear() {
		return bloquear;
	}

	public void setBloquear(boolean bloquear) {
		this.bloquear = bloquear;
	}
	
}

