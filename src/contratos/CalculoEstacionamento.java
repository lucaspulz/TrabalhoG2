package contratos;

//é um contrato onde a classe paciente utilizada para calcular o valor do estacionamento
//apos ser implementada na classe é obrigatorio o uso do mesmo a classe contrato não vai programação
public interface CalculoEstacionamento {
	
	public abstract double calculoEstacionamento(double horas);
}
