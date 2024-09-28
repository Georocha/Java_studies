package br.edu.ifs.loja.service;

import br.edu.ifs.loja.model.Pedido;

public interface ImpostoStrategy {
	double calcularImposto(Pedido pedido);
}
