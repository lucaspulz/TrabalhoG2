package entidades;

import java.util.Date;

import javax.swing.JOptionPane;

import contratos.CalculoEstacionamento;

//Classe paciente herda os atributos de Pessoa e Implementa o Estacionamento para calcular o valor
public class Paciente extends Pessoa implements CalculoEstacionamento {
	
	private Doenca doenca;
	private Quarto quarto;
	private Remedio remedio;
	private double valor;
	
	
	
	
	public Paciente() {
		
	}
	
	
	//Construtor da Classe (Super para pegar os atributos da Super classe)
	public Paciente(int id,String nome, Contato contato, Endereco endereco, String dataNascimento, int rg, String cpf,
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

	

	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
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


	//Calculo da classe interface
	@Override
	public double calculoEstacionamento(double horas) {
		
		double total = horas * 10;
		return total;
	}
	
	}
	


