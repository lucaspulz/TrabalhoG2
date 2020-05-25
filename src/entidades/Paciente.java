package entidades;

import java.util.Date;

public class Paciente extends Pessoa {
	
	private Doenca doenca;
	private Quarto quarto;
	
	
	public Paciente() {
		
	}
	
	
	
	public Paciente(String nome, Contato contato, Endereco endereco, Date dataNascimento, int rg, int cpf,
			Doenca doenca, Quarto quarto) {
		super(nome, contato, endereco, dataNascimento, rg, cpf);
		this.doenca = doenca;
		this.quarto = quarto;
	}

	public Doenca getDoenca() {
		return doenca;
	}
	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	
	

}
