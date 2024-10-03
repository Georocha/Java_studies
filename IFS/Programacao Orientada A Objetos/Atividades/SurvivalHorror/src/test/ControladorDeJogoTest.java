package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.ControladorDeJogo;
import model.FabricaKitMedico;
import model.FabricaEspada;
import model.FabricaItem;
import model.Jogador;
import model.Sala;

public class ControladorDeJogoTest {
	
	private Jogador jogador;
	private Sala sala;
	private ControladorDeJogo controlador;
	
	@BeforeEach
	void setUp() {
		jogador = new Jogador();
		sala = new Sala("Sala escura");
		controlador = new ControladorDeJogo(jogador, sala);
		
		FabricaItem fabricaKitMedico = new FabricaKitMedico();
		FabricaItem fabricaEspada = new FabricaEspada();
		sala.adicionarItem(fabricaKitMedico.criarItem());
		sala.adicionarItem(fabricaEspada.criarItem());
	}
	
	@Test
	void testPegarUsarKitMedico() {
		controlador.pegarUsarItem();
		assertEquals(120, jogador.getVida());
	}
	
	@Test
	void testPegarUsarEspada() {
		controlador.pegarUsarItem();
		controlador.pegarUsarItem();
		assertTrue(jogador.getDano() > 10);
	}
	
	@Test
	void testPegarItemSemhaverItem() {
		sala.pegarItem();
		sala.pegarItem();
		assertNull(sala.pegarItem());
	}
}
