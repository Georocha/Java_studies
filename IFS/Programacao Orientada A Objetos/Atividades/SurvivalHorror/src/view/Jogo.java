package view;

import controller.Caretaker;
import controller.ControladorDeJogo;
import model.Corredor;
import model.EstadoFerido;
import model.EstadoMorto;
import model.EstadoVivo;
import model.FabricaEspada;
import model.FabricaInimigo;
import model.FabricaMutante;
import model.FabricaZumbi;
import model.FabricaItem;
import model.FabricaKitMedico;
import model.Inimigo;
import model.Item;
import model.Jogador;
import model.Mapa;
import model.Sala;

public class Jogo {
	
	public static void main(String[] args) {
		
		FabricaInimigo fabrica = new FabricaZumbi();
		Inimigo zumbi = fabrica.criarInimigo();
		
		Jogador jogador = new Jogador();
		jogador.setNome("Rick");
		
		zumbi.atacar(jogador);
		jogador.atacar(zumbi);
		//zumbi.receberDano(10);
		
		System.out.println("-----------------------");
		fabrica = new FabricaMutante();
		Inimigo mutante = fabrica.criarInimigo();
		mutante.atacar(jogador);
		jogador.atacar(mutante);
		//mutante.receberDano(20);
		System.out.println("-----------------------"); 
		
		Mapa mapa = Mapa.getInstancia();
		mapa.exibir();
		
		//COMPOSITE ----------------------------
		Sala sala1 = new Sala("Sala de estar");
		Sala sala2 = new Sala("Sala de jantar");
		
		Corredor corredor1 = new Corredor("Corredor Principal");
		corredor1.adicionar(sala1);
		corredor1.adicionar(sala2);
		corredor1.exibir();
		
		/**Item chave = new Item("Chave mágica");
		sala1.adicionar(chave);
		sala1.adicionar(new Item("Kit médico"));
		sala1.interagir();**/
		
		//STATE --------------------------------
		jogador.executarAcao();
		
		//Jogador se feriu
		jogador.setEstado(new EstadoFerido());
		jogador.executarAcao();
		
		//Jogador morreeeeu!
		jogador.setEstado(new EstadoMorto());
		jogador.executarAcao();
		// -------------------------------------
		
		// OBSERVER ---------------------------------
		Jogador jogador2 = new Jogador();
		InterfaceUsuario ui = new InterfaceUsuario();
		jogador2.setNome("Jogador 2");
		jogador2.adicionarObserver(ui);
		jogador2.receberDano(20);
		// -------------------------------------------
		
		// MEMENTO -----------------------------------------
		Jogador jogador3 = new Jogador();
		Caretaker caretaker = new Caretaker();
		jogador3.setEstadoMemento("Vivo");
		caretaker.adicionarMemento(jogador3.salvarEstado());
		jogador3.setEstadoMemento("Ferido");
		caretaker.adicionarMemento(jogador3.salvarEstado());
		jogador3.setEstadoMemento("Morto");
		jogador3.restaurarEstado(caretaker.getMemento(0));
		// --------------------------------------------------
		
		// -------------------------
		Jogador jogador4 = new Jogador();
		jogador4.setNome("Blade");
		Sala sala3 = new Sala("Sala de vivência");
		sala3.exibir();
		
		FabricaItem fabricakitMedico = new FabricaKitMedico();
		FabricaItem fabricaEspada = new FabricaEspada();
		
		sala3.adicionarItem(fabricakitMedico.criarItem());
		sala3.adicionarItem(fabricaEspada.criarItem());
		
		ControladorDeJogo controlador = new ControladorDeJogo(jogador4, sala3);
		
		controlador.pegarUsarItem();
		controlador.pegarUsarItem();
	}
}
