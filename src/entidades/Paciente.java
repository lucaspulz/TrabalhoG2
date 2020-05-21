package entidades;

import java.util.Date;

public class Paciente {
	private String nome;
	private Contato contato;
	private Endereco endereco;
	private Date dataNascimento;
	private int rg;
	private int cpf;
	private Doenca doenca;
	private Quarto quarto;
	
	
	public Paciente() {
	}
	public Paciente(String nome, Contato contato,Date dataNascimento,  int cpf,Quarto quarto) {
		this.nome = nome;
		this.contato = contato;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.quarto = quarto;
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
