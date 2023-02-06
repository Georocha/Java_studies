package avaliacao1;

public class Medicamento{

	private String descricao;

	private int qtEstoque;

	private String unidadeMedida;

	public Medicamento(String descricao, int qtEstoque, String unidadeMedida) {
      setDescricao(descricao);
      setQtEstoque(qtEstoque);
      setUnidadeMedida(unidadeMedida);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtEstoque() {
		return qtEstoque;
	}

	public void setQtEstoque(int qtEstoque) {
		this.qtEstoque = qtEstoque;
	}
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- Descrição:" + getDescricao() + " - Qt. em Estoque:" + getQtEstoque() + " - Unidade Medida:" + getUnidadeMedida();
	}
}
