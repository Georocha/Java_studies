package view;

import model.Observer;

public class InterfaceUsuario implements Observer {

	@Override
	public void atualizar(String evento) {
		// TODO Auto-generated method stub
		System.out.println("Interface do usuário: " + evento);
	}
	
}
