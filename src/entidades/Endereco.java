package entidades;

//Classe endereco adicionada na Classe Paciente e Funcionario
public class Endereco {
	private String rua;
	private String bairro;
	private String cidadeEEstado;
	private String CEP;
	private int numCasa;
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidadeEEstado() {
		return cidadeEEstado;
	}
	public void setCidadeEEstado(String cidadeEEstado) {
		this.cidadeEEstado = cidadeEEstado;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public int getNumCasa() {
		return numCasa;
	}
	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}
	
	

}
