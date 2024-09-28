package br.edu.ifs.loja.service;

import br.edu.ifs.loja.model.Pedido;
import br.edu.ifs.loja.model.Item;

public class ImpostoProdutoStrategy implements ImpostoStrategy {
	

	@Override
	public double calcularImposto(Pedido pedido) {
		// TODO Auto-generated method stub
		double totalImposto = 0;
		
		for (Item item : pedido.getItens()) {
			if(item.getNome().equalsIgnoreCase("Livro")) {
				totalImposto += item.getPreco() * 0.05;
			} else if(item.getNome().equalsIgnoreCase("Eletrodomestico")){
				totalImposto += item.getPreco() * 0.2;
			} else {
				totalImposto += item.getPreco() * 0.1;
			}
		}
		return totalImposto;
	
	}
}
