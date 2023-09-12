package a07_p02_interface;

public interface Lista {
	public void adiciona(Object obj);
	public void adiciona(Object obj, int pos);
	public Object pega(int pos);
	public int busca(Object elemento);
	public void remove(int pos);
	public int quantidade();
}
