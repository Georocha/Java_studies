package avaliacao01_geovane;

public class Medicamento {

	private String descricao;
	private int quantidadeEmEstoque;
	private String unidadeMedida;
	
	public Medicamento(String descricao, int quantidadeEmEstoque, String unidadeMedida) {
		super();
		this.descricao = descricao;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.unidadeMedida = unidadeMedida;
	}
	
	public Medicamento() {
		
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
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
		return " | Medicamento cadastrado: " + " - Descricao: " + getDescricao() + " - Quantidade em estoque: " + getQuantidadeEmEstoque()
		+ " - Unidade Medida: " + getUnidadeMedida() + "\n"
		;
	}

}
