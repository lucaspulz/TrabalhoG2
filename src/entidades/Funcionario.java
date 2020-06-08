package entidades;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(int id,String nome, Contato contato, Endereco endereco, Date dataNascimento, int rg, int cpf,
			String cargo, double salario) {
		super(id,nome, contato, endereco, dataNascimento, rg, cpf);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
