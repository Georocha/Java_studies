package test;

import org.junit.jupiter.api.Test;

import model.Jogador;
import model.Mapa;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
	
	@Test
	void testJogador() {
		Jogador jogador1 = Jogador.getInstancia();
		Jogador jogador2 = Jogador.getInstancia();
		assertSame(jogador1, jogador2, "Deve retornar a mesma instancia do jogador");
	}
	
	@Test
	void testMapa() {
        Mapa mapa1 = Mapa.getInstancia();
        Mapa mapa2 = Mapa.getInstancia();
        assertSame(mapa1, mapa2, "Deve retornar a mesma instancia do mapa");
    }
	
}
