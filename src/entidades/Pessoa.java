package entidades;

import java.util.Date;

import javax.swing.JOptionPane;
//Classe Abstrata pois não precisa ser instanciada e é a Super Classe

public abstract class Pessoa {
	
	private int id;
	private String nome;
	private Contato contato;
	private Endereco endereco;
	private String dataNascimento;
	private int rg;
	private String cpf;
	private double salario;
	
	
	
	public Pessoa() {
		super();
	}
	//Costrutor da classe pessoa 
	public Pessoa(int id,String nome, Contato contato, Endereco endereco, String dataNascimento, int rg, String cpf) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	}
	
	


