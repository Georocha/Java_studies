package br.edu.ifs.loja.controller;


import br.edu.ifs.loja.model.Pedido;

public class CheckoutController {

    public void processarCheckout(Pedido pedido) {
        if (validarPedido(pedido)) {
            gerarNotaFiscal(pedido);
            atualizarEstoque(pedido);
        }
    }

    private boolean validarPedido(Pedido pedido) {
        // Lógica de validação do pedido
        return true;
    }

    private void gerarNotaFiscal(Pedido pedido) {
        // Geração da nota fiscal
        System.out.println("Nota fiscal gerada para o pedido.");
    }

    private void atualizarEstoque(Pedido pedido) {
        // Atualização do estoque
        System.out.println("Estoque atualizado.");
    }
}
