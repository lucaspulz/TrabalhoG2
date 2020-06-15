package entidades;

import java.util.Date;

//Classe Funcionario herda todos os atributos de Pessoa
public class Funcionario extends Pessoa {
	
	private String cargo;
	
	
	public Funcionario() {
		
	}
	//Construtor  (Super para usar os atributos de Pessoa no Contrutor)
	public Funcionario(int id,String nome, Contato contato, Endereco endereco, String dataNascimento, int rg, String cpf,
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
