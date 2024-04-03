package atividade3_bancoIta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1, "Geovane", "123.456.789-00", "Travessa A, 123");

        ContaCorrente contaCorrente = new ContaCorrente(1995, cliente, 4000.0, 0.5);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2995, cliente, 0.2);
        
        System.out.println("Deposito CC: 1000 ");
        contaCorrente.depositar(1000);
        System.out.println("Deposito CP: 2000 ");
        contaPoupanca.depositar(2000);
        System.out.println("Saque CC: 700 ");
        contaCorrente.sacar(700);
        System.out.println("Saque Cp: 500 ");
        contaPoupanca.sacar(500);
        
        contaCorrente.pagar(50);
        
      
        contaCorrente.atualizarSaldo();
        
        contaCorrente.transferir(200, contaPoupanca);
        contaPoupanca.atualizarSaldo();

        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
        
        
        System.out.println("Transações da conta corrente:");
        for (Transacao transacao : contaCorrente.getTransacoes()) {
            System.out.println(transacao.getTipo() + " - Valor: " + transacao.getValor() + " - Data: " + transacao.getData());
        }

        System.out.println("Transações da conta poupança:");
        for (Transacao transacao : contaPoupanca.getTransacoes()) {
            System.out.println(transacao.getTipo() + " - Valor: " + transacao.getValor() + " - Data: " + transacao.getData());
        }
		
		contaCorrente.bloquearConta();
		System.out.println(contaCorrente.isBloquear());
		contaCorrente.desbloquearConta();
	}

}
