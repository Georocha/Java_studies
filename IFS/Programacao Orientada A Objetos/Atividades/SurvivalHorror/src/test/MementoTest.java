package test;
import org.junit.jupiter.api.Test;

import model.Memento;

import static org.junit.jupiter.api.Assertions.*;

public class MementoTest {
	
	@Test
	void testMemento() {
		Memento memento = new Memento("Estado inicial");
		assertEquals("Estado inicial", memento.getEstado());
	}
	
}
