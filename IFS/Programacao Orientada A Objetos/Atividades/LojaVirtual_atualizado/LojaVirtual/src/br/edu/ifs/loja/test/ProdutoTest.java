package br.edu.ifs.loja.test;

import br.edu.ifs.loja.model.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
	
	private Produto produto;
	
	@BeforeEach
	public void setUp() {
		produto = new Produto("Produto teste", 100.0);
	}
	
	@Test
	public void testAtualizarPreco() {
		produto.atualizarPreco(120.0);
		assertEquals(120.0, produto.getPrecoAtual(),0.0001);
	}
	
	@Test
	public void testHistoricoPrecos() {
		produto.atualizarPreco(120.0);
		produto.atualizarPreco(150.0);
		
		assertEquals(3, produto.getHistoricoPrecos().size());
		assertEquals(100.0, produto.getHistoricoPrecos().get(0), 0.0001);
		assertEquals(120.0, produto.getHistoricoPrecos().get(1), 0.0001);
		assertEquals(150.0, produto.getHistoricoPrecos().get(2), 0.0001);
		
	}
	
}
