package repositorio;

import javax.swing.JOptionPane;

//Classe Doação para ao termina de cadastrar o funcionario ou paciente 
//criada para usar o mesmo metodo com varias assinaturas.
public class RepositorioDoacao {
	
	public double valorDoado(double valor) {
		valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Quanto quer Doar ? "));
		return  valor;
	}
	
	public int valorDoardo(int valor) {
		valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto quer Doar ? "));
		return  valor;
	}
	public float valorDoardo(float valor) {
		valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Quanto quer Doar ? "));
		return  valor;
	}
}
