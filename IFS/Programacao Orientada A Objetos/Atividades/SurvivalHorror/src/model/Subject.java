package model;

public interface Subject {
	void adicionarObserver(Observer observer);
	void removerObserver(Observer observer);
	void notificarObserver(String evento);
}
