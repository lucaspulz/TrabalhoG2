package servicos;

import javax.swing.JOptionPane;

import repositorio.RepositorioDoacao;

public class ServicoDoacao {
	//Estancia a classe repositorio Doa��o
	RepositorioDoacao repositorioDoacao;
	
	
	public ServicoDoacao() {
		repositorioDoacao = new RepositorioDoacao();
		}
	//Vali��o dos valores a serem doardos com todas as assinaturas
	public double valorDoado(double valor) {
		if(valor>0) {
		JOptionPane.showMessageDialog(null, "Obrigado pela Doa��o de em Dinheiro: "+valor);
		return 0;
	}
		else {
		JOptionPane.showMessageDialog(null, "N�o Pode Doar Valor Negativo ou Nada" );
		return 0;
		}
	}
	public int valorDoado(int valor) {
		if(valor>0) {
		JOptionPane.showMessageDialog(null, "Obrigado pela Doa��o em Cheque : "+valor);
		return 0;
	}
		else {
			JOptionPane.showMessageDialog(null, "N�o Pode Doar Valor Negativo ou Nada" );
			return 0;
			}
	}
	public float valorDoado(float valor) {
		if(valor>0) {
		JOptionPane.showMessageDialog(null, "Obrigado pela Doa��o Em Cart�es : "+valor);
		return 0;
	}
		else {
			JOptionPane.showMessageDialog(null, "N�o Pode Doar Valor Negativo ou Nada" );
			return 0;
			}
	}}


