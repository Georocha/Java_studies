package test;

import org.junit.jupiter.api.Test;

import model.Corredor;
import model.Sala;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {
	
	@Test
	void testCorredorComSala() {
		Corredor corredor = new Corredor("Corredor Principal");
		Sala sala1 = new Sala("Sala de Estar");
		Sala sala2 = new Sala("Sala de Jantar");
		
		corredor.adicionar(sala1);
		corredor.adicionar(sala2);
		
		assertEquals(3, corredor.getComponentes().size());
		
	}
	
}
