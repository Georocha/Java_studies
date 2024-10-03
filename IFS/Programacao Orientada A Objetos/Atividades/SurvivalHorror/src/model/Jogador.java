package model;

import java.util.ArrayList;
import java.util.List;

public class Jogador implements Subject {
	
	private int vida = 100;
	private int dano;
	private String nome;
	private static Jogador instancia;
	private EstadoJogador estado;
	private String estadoMemento;
	private List<Observer> observers = new ArrayList<>();
	
	public Jogador() {
		estado = new EstadoVivo();
	}
	
	public static Jogador getInstancia() {
		if(instancia == null) {
			instancia = new Jogador();
		}
		return instancia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVida() {
		return vida;
	}

	public int getDano() {
		return dano;
	}

	public EstadoJogador getEstado() {
		return estado;
	}

	public void setEstado(EstadoJogador estado) {
		this.estado = estado;
	}
	
	public void setEstadoMemento(String estadoMemento) {
		this.estadoMemento = estadoMemento;
		System.out.println("Estado do jogador alterado para: " + estadoMemento );
	}
	
	public String getEstadoMemento() {
		return estadoMemento;
	}

	public Memento salvarEstado() {
		return new Memento(estadoMemento);
	}
	
	public void restaurarEstado(Memento memento) {
		estadoMemento = memento.getEstado();
		System.out.println("Estado do jogador restaurado para: " + estadoMemento);
	}
	public void mover(String direcao) {
		System.out.println("Jogador se move para " + direcao);
	}
	
	public void executarAcao() {
		estado.executarAcao(this);
	}
	
	public void atacar(Inimigo inimigo) {
		int dano = 10;
		System.out.println(nome + " Ataca!");
		inimigo.receberDano(dano);
	}
	
	public void aumentarDano(int quantidade) {
		dano += quantidade;
		System.out.println("Dano do jogador agora é: " + dano);
	}
	
	public void receberDano(int dano) {
		vida -= dano;
		if (vida <= 0) {
			setEstadoMemento(" Morto");
			notificarObserver("Jogador morto!");
		} else {
			System.out.println(nome + "recebeu" + dano + " de dano");
			notificarObserver("Jogador ferido!");
		}
	}

	@Override
	public void adicionarObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notificarObserver(String evento) {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.atualizar(evento);
		}
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void cura(int cura) {
		// TODO Auto-generated method stub
		vida += cura;
		
	}
	
	
}
