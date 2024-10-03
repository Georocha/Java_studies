package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import model.Jogador;

public class JogadorTest {
	
	@Test
	void testEstadoJogador() {
		Jogador jogador = new Jogador();
		jogador.setEstadoMemento("Vivo");
		assertEquals("Vivo", jogador.getEstadoMemento());
		
		jogador.setEstadoMemento("Ferido");
		assertEquals("Ferido", jogador.getEstadoMemento());
		
		jogador.setEstadoMemento("Morto");
		assertEquals("Morto", jogador.getEstadoMemento());
		
	}
	
}
