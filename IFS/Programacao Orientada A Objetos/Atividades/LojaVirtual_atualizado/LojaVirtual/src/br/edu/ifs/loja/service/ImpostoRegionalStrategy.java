package br.edu.ifs.loja.service;

import br.edu.ifs.loja.model.Pedido;

public class ImpostoRegionalStrategy implements ImpostoStrategy {
	private String regiao;

	public ImpostoRegionalStrategy(String regiao) {
		super();
		this.regiao = regiao;
	}

	@Override
	public double calcularImposto(Pedido pedido) {
		// TODO Auto-generated method stub
		if (regiao.equals("SE")) {
			return pedido.calcularTotalSemImposto() * 0.19;
		} else if (regiao.equals("BA")) {
			return pedido.calcularTotalSemImposto() * 0.24;
		}
		return pedido.calcularTotalSemImposto() * 0.12;
	}
	
	
}
