package atividade3_bancoIta;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta {
	
	    private double taxaJuros;

	   

		public ContaPoupanca(int numeroConta2, Cliente titularConta2, double taxaJuros) {
			super(numeroConta2, titularConta2);
			this.taxaJuros = taxaJuros;
		}

		@Override
	    public void depositar(double valor) {
	        saldo += valor;
	        transacoes.add(new Transacao("Depósito", valor));
	    }

	    @Override
	    public void sacar(double valor) {
	        if (saldo >= valor) {
	            saldo -= valor;
	            transacoes.add(new Transacao("Saque", -valor));
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }

	    @Override
	    public void transferir(double valor, Conta contaDestino) {
	        if (saldo >= valor) {
	            saldo -= valor;
	            transacoes.add(new Transacao("Transferência", -valor));
	            contaDestino.depositar(valor);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }

	    @Override
	    public double getSaldo() {
	        return saldo;
	    }

	    @Override
	    public List<Transacao> getTransacoes() {
	        return transacoes;
	    }

	    public double getTaxaJuros() {
	        return taxaJuros;
	    }

	    public void setTaxaJuros(double taxaJuros) {
	        this.taxaJuros = taxaJuros;
	    }

	    public void atualizarSaldo() {
	        double juros = saldo * taxaJuros;
	        saldo += juros;
	        transacoes.add(new Transacao("Juros", juros));
	    }
	
}
