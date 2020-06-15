package servicos;

import javax.swing.JOptionPane;

import repositorio.RepositorioDoacao;

public class ServicoDoacao {
	//Estancia a classe repositorio Doação
	RepositorioDoacao repositorioDoacao;
	
	
	public ServicoDoacao() {
		repositorioDoacao = new RepositorioDoacao();
		}
	//Valição dos valores a serem doardos com todas as assinaturas
	public int valorDoado(int valor) {
		if(valor>0) {
		
		return valor;
	}
		else {
		
		return 0;
		}
	}
	public double valorDoado(double valor) {
		if(valor>0) {
			
		return valor;
	}
		else {
			
		return 0;
			}
	}
	public float valorDoado(float valor) {
		if(valor>0) {
			
		return valor;
	}
		else {
		
			return 0;
			}
	}}


