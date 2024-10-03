package test;

import org.junit.jupiter.api.Test;

import model.Jogador;
import view.InterfaceUsuario;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {
	
	@Test
	void testAdicionarObserver() {
		Jogador jogador = new Jogador();
		jogador.setNome("Jogador 1");
		InterfaceUsuario ui = new InterfaceUsuario();
		
		jogador.adicionarObserver(ui);
		assertTrue(jogador.getObservers().contains(ui));
	}
	
	@Test
	void testRemoveObserver() {
		Jogador jogador = new Jogador();
		jogador.setNome("Jogador 1");
		InterfaceUsuario ui = new InterfaceUsuario();
		
		jogador.adicionarObserver(ui);
		jogador.removerObserver(ui);
		assertFalse(jogador.getObservers().contains(ui));
	}
	
}
