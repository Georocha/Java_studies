package br.edu.ifs.loja.factory;

import br.edu.ifs.loja.model.Produto;

public class ProdutoFactory {
    public Produto criarProduto(String nome, String descricao, double preco) {
        return new Produto(nome, preco);  // descrição é opcional, foi removida
    }
}
