package br.edu.ifs.loja.service;

import br.edu.ifs.loja.model.Pedido;

public class ImpostoZeroStrategy implements ImpostoStrategy {

	@Override
	public double calcularImposto(Pedido pedido) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
