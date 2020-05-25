package entidades;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Contato contato;
	private Endereco endereco;
	private Date dataNascimento;
	private int rg;
	private int cpf;
	
	
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, Contato contato, Endereco endereco, Date dataNascimento, int rg, int cpf) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	

}
