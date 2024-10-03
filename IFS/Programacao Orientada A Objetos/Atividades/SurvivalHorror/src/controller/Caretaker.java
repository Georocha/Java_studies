package controller;

import java.util.ArrayList;
import java.util.List;

import model.Memento;

public class Caretaker {
	
	private List<Memento> historico = new ArrayList<>();
	
	public void adicionarMemento(Memento memento) {
		historico.add(memento);
	}
	
	public Memento getMemento(int index) {
		return historico.get(index);
	}
}
