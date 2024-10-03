package model;

public class EstadoMorto implements EstadoJogador {

	@Override
	public void executarAcao(Jogador jogador) {
		// TODO Auto-generated method stub
		System.out.println("Jogador está morto. Fim do jogo");
	}
	
}
