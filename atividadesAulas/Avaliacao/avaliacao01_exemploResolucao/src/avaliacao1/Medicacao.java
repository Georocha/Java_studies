package avaliacao1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Medicacao {

	private Medicamento medicamento;
	
	private int quantidade;
	
	private Date data;
	
	//private String hora;
	
	public Medicacao(Medicamento medicamento, int quantidade, Date data) {
		setMedicamento(medicamento);
		setQuantidade(quantidade);
		setData(data);
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "- Medicamento[" + getMedicamento() + "] - Quantidade:" + getQuantidade() + " - Data:" + getDataFormatada() + "Hora:" + getHora();
	}

	public String getDataFormatada() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(getData());
	}

	public String getHora() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(getData());
	}
}
