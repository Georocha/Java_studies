package br.edu.ifs.loja.model;

import br.edu.ifs.loja.service.ImpostoStrategy;
import java.util.List;

public class Pedido {
    private List<Item> itens;
    private double frete;
    private ImpostoStrategy impostoStrategy;

    public Pedido(List<Item> itens, double frete, ImpostoStrategy impostoStrategy) {
        this.itens = itens;
        this.frete = frete;
        this.impostoStrategy = impostoStrategy;
    }

    public double calcularTotal() {
        /**double totalProdutos = itens.stream()
                                    .mapToDouble(Item::getPreco)
                                    .sum();**/
    	double totalSemImposto = calcularTotalSemImposto();
    	double imposto = impostoStrategy.calcularImposto(this);
        return totalSemImposto + frete + imposto;
    }

    public List<Item> getItens() {
        return itens;
    }

	public double calcularTotalSemImposto() {
		// TODO Auto-generated method stub
		return itens.stream().mapToDouble(Item::getPreco).sum();
	}
}

