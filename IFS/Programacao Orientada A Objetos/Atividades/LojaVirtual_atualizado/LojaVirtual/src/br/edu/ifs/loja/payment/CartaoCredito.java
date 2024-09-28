package br.edu.ifs.loja.payment;


public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado com cartão de crédito.");
    }
}
