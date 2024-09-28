package br.edu.ifs.loja.test;


import br.edu.ifs.loja.model.Item;
import br.edu.ifs.loja.model.Pedido;
import br.edu.ifs.loja.service.ImpostoProdutoStrategy;
import br.edu.ifs.loja.service.ImpostoRegionalStrategy;
import br.edu.ifs.loja.service.ImpostoZeroStrategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;


public class PedidoTest {

    @Test
    public void testCalcularTotal() {
        Item item1 = new Item("Produto 1", 100.0);
        Item item2 = new Item("Produto 2", 200.0);
        ImpostoRegionalStrategy impostoBA = new ImpostoRegionalStrategy("BA");
        Pedido pedido = new Pedido(Arrays.asList(item1, item2), 50.0,impostoBA);

        double total = pedido.calcularTotal();
        assertEquals(380.0,total, 0.0001);  // Adiciona delta para comparação de double
    }
    
    @Test
    public void testCalcularTotalSemItens() {
    	ImpostoRegionalStrategy impostoBA = new ImpostoRegionalStrategy("BA");
    	Pedido pedido = new Pedido(Collections.emptyList(),50.0,impostoBA);
    	double total = pedido.calcularTotal();
    	assertEquals(80.0,total,0.0001);
    }
    
    @Test
    public void testCalcularTotalComFreteEImpostoZero() {
    	Item item1 = new Item("Produto 1", 100.0);
    	ImpostoZeroStrategy imposto = new ImpostoZeroStrategy();
    	Pedido pedido = new Pedido(Arrays.asList(item1), 0.0, imposto);
    	double total = pedido.calcularTotal();
    	assertEquals(100.0,total,0.0001);
    }
    
    @Test
    public void testCalcularImpostoPorTipoDeProduto() {
    	Item livro = new Item("Livro",100.0);
    	Item eletrodomestico = new Item("Eletrodoméstico", 300.0);
    	ImpostoProdutoStrategy impostoProduto = new ImpostoProdutoStrategy();
    	Pedido pedido = new Pedido(Arrays.asList(livro, eletrodomestico), 50.0, impostoProduto);
    	
    	double total = pedido.calcularTotal();
    	assertEquals(470.0,total,0.0001);
    }
    
}

