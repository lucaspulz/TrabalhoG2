package entidades;

import java.util.Date;

public class Paciente extends Pessoa {
	
	private Doenca doenca;
	private Quarto quarto;
	private Remedio remedio;
	
	
	
	
	public Paciente() {
		
	}
	
	
	
	public Paciente(int id,String nome, Contato contato, Endereco endereco, Date dataNascimento, int rg, int cpf,
			Doenca doenca, Quarto quarto,Remedio remedio) {
		super(id,nome, contato, endereco, dataNascimento, rg, cpf);
		this.doenca = doenca;
		this.quarto = quarto;
		this.remedio =  remedio;
	}
	
	
	public Remedio getRemedio() {
		return remedio;
	}



	public void setRemedio(Remedio remedio) {
		this.remedio = remedio;
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
