package entidades;

import java.math.BigInteger;

//Classe Contato onde é instanciada na classe Pessoa e Funcionario 
public class Contato {
	private int telefoneResidencial;
	private int whatsApp;
	private int telefoneCelular;
	
	public int getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(int telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public int getWhatsApp() {
		return whatsApp;
	}
	public void setWhatsApp(int whatsApp) {
		this.whatsApp = whatsApp;
	}
	public int getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(int telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	

}
