package avaliacao1;

import java.util.Collection;
import java.util.Date;

public class Bebe extends Pessoa {
	
	private Mae mae;
	
	private Medico medico;
	
	private Collection<Medicacao> medicacoes;

	public Bebe(String nome, Date dataNascimento, Mae mae, Medico medico) {
		super(nome, dataNascimento);
		setMae(mae);
		setMedico(medico);
	}

	public Mae getMae() {
		return mae;
	}

	public void setMae(Mae mae) {
		this.mae = mae;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " - Mae[" + getMae() + "] - Medico[" + getMedico() + "]";
	}

	public Collection<Medicacao> getMedicacoes() {
		return medicacoes;
	}

	public void setMedicacoes(Collection<Medicacao> medicacoes) {
		this.medicacoes = medicacoes;
	}
	
	public void adicionarMedicacao(Medicacao medicacao) {
		getMedicacoes().add(medicacao);
	}
	
	
}