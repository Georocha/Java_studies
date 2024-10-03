package test;

import org.junit.jupiter.api.Test;

import model.FabricaHumanoides;
import model.FabricaInimigo;
import model.FabricaMutante;
import model.FabricaZumbi;
import model.Humanoides;
import model.Inimigo;
import model.Mutante;
import model.Zumbi;

import static org.junit.jupiter.api.Assertions.*;

public class FabricaInimigosTest {

	@Test
	void testFabricaZumbi() {
		FabricaInimigo fabrica = new FabricaZumbi();
		Inimigo zumbi = fabrica.criarInimigo();
		assertNotNull(zumbi);
		assertTrue(zumbi instanceof Zumbi);
	}
	
	@Test
	void testFabricaMutante() {
		FabricaInimigo fabrica = new FabricaMutante();
		Inimigo mutante = fabrica.criarInimigo();
		assertNotNull(mutante);
		assertTrue(mutante instanceof Mutante);
	}
	
	@Test
	void testFabricaHumanoides() {
		FabricaInimigo fabrica = new FabricaHumanoides();
		Inimigo humanoide = fabrica.criarInimigo();
		assertNotNull(humanoide);
		assertTrue(humanoide instanceof Humanoides);
	}
	
}
