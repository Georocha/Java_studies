package aula2_arvores;

public class Programa {

	public static void main(String[] args) {
		
		Nodo veiculo = new Nodo("Veículo");
		
		Nodo aereo = new Nodo("Aéreo");
		veiculo.adicionaFilho(aereo);
		Nodo aviao = new Nodo("Avião");
		aereo.adicionaFilho(aviao);
		Nodo heli = new Nodo("Helicóptero");
		aereo.adicionaFilho(heli);
		
		Nodo terrestre = new Nodo("Terrestre");
		veiculo.adicionaFilho(terrestre);
		Nodo carro = new Nodo("Carro");
		terrestre.adicionaFilho(carro);
		Nodo moto = new Nodo("Motocicleta");
		terrestre.adicionaFilho(moto);
		
		Nodo aquatico =  new Nodo("Aquático");
		veiculo.adicionaFilho(aquatico);
		Nodo aMotor = new Nodo("A Motor");
		aquatico.adicionaFilho(aMotor);
		Nodo aVela = new Nodo("A vela");
		aquatico.adicionaFilho(aVela);
		Nodo aRemo = new Nodo("A remo");
		aquatico.adicionaFilho(aRemo);
		
		Nodo navio = new Nodo("Navio");
		aMotor.adicionaFilho(navio);
		Nodo iate = new Nodo("Iate");
		aMotor.adicionaFilho(iate);
		Nodo lancha = new Nodo("Lancha");
		aMotor.adicionaFilho(lancha);
		
		System.out.println(veiculo);
		

	}

}
