package atividade3_bancoIta;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

	private double limiteCredito;
	private double limiteSaque = 5000;
	private double taxaJuros = 0.5;
	


	public ContaCorrente(int numeroConta2, Cliente titularConta2, double limiteCredito, double taxaJuros) {
		super(numeroConta2, titularConta2);
		this.limiteCredito = limiteCredito;
		this.taxaJuros = taxaJuros;
	}

	@Override
    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao("Depósito", valor));
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteCredito >= valor) {
            saldo -= valor;
            transacoes.add(new Transacao("Saque", -valor));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void atualizarSaldo() {
    	if (saldo < 0) {
    		double juros = saldo * taxaJuros;
            saldo += juros;
            transacoes.add(new Transacao("Juros", juros));
    	} else {
    		System.out.println(getSaldo());
    	}
    }
    
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo + limiteCredito >= valor) {
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

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
	
}
