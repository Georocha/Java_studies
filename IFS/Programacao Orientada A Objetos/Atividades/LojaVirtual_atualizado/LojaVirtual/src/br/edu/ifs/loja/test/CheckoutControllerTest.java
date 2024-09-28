package br.edu.ifs.loja.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifs.loja.controller.CheckoutController;
import br.edu.ifs.loja.model.Item;
import br.edu.ifs.loja.model.Pedido;
import br.edu.ifs.loja.service.ImpostoRegionalStrategy;

public class CheckoutControllerTest {
	
	private CheckoutController checkoutController;
	private Pedido pedido;
	
	@BeforeEach
	public void setUp() {
		checkoutController = new CheckoutController();
		Item item1 = new Item("Produto 1", 100.0);
		Item item2 = new Item("Produto 2", 200.0);
		ImpostoRegionalStrategy impostoSE = new ImpostoRegionalStrategy("SE");
		pedido = new Pedido(Arrays.asList(item1, item2), 50.0, impostoSE);
	}
	
	@Test
	public void testProcessarCheckout() {
		assertDoesNotThrow(() -> checkoutController.processarCheckout(pedido));
	}
	
}
