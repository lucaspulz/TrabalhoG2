package entidades;

//Classe Doenca adicionado a classe Paciente
public class Doenca {
	private String nome;
	private Remedio remedio = new Remedio();
	private String gravidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Remedio getRemedio() {
		return remedio;
	}
	
	public void setRemedio(Remedio remedio) {
		this.remedio = remedio;
	}
	public String getGravidade() {
		return gravidade;
	}
	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}
	
	
}
