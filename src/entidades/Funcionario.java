package entidades;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	private String cargo;
	
	
	public Funcionario() {
		
	}

	public Funcionario(int id,String nome, Contato contato, Endereco endereco, Date dataNascimento, int rg, int cpf,
			String cargo,double salario) {
		super(id,nome, contato, endereco, dataNascimento, rg, cpf);
		this.cargo = cargo;
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	//Ganha 20% por ser funcionario Medico (Sobrescrevendo o metodo)
	public double getSalario(double salario) {
		return super.getSalario()+salario*0.2;
	}

	
	

}
