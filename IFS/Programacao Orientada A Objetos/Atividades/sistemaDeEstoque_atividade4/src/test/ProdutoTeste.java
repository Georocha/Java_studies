package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.Produto;


public class ProdutoTeste {
	
	@Test
	public void cadastrarProdutoTeste() {
		Produto produto = new Produto("Nome", "Descrição", 1, 25.0, LocalDate.of(2024, 8, 31));
		assertEquals("Nome", produto.getNome());
		assertEquals("Descrição", produto.getDescricao());
		assertEquals(1, produto.getQuantidade());
		assertEquals(25.0, produto.getPreco());
		assertEquals(LocalDate.of(2024, 8, 31), produto.getValidade());
	}
	
	@Test
	public void entradaProdutoTeste() {
		Produto produto = new Produto("Nome", "Descrição", 1, 25.0, LocalDate.of(2024, 8, 31));
		produto.entrada(100);
		assertEquals(101,produto.getQuantidade());
	}
	
	@Test
	public void saidaProdutoTeste() {
		Produto produto = new Produto("Nome", "Descrição", 1, 25.0, LocalDate.of(2024, 8, 31));
		produto.entrada(100);
		assertTrue(produto.saida(1));
		assertEquals(100 ,produto.getQuantidade());
		assertFalse(produto.saida(101));
		assertEquals(100, produto.getQuantidade());
	}
	
}
