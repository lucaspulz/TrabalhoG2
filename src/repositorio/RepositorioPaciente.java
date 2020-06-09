package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Paciente;

//Classe para  SALVAR,DELETAR,LISTAR Pacientes
public class RepositorioPaciente {
	//Cria uma Lista de Paciente
	public static List<Paciente> pacientes = new ArrayList();
	
	//Metodo para salvar Paciente da Na Lista
	public String salvaPaciente(Paciente paciente) {
		//Usa o id do paciente para salvar como referencia
		paciente.setId(pacientes.size()+1);
		pacientes.add(paciente);
		return "Paciente Salvo com Sucesso";
	}
	//Metodo para Listar os Funcionario da Lista
	public List<Paciente> findlAll(){
		return pacientes;
	}
	//Metodo para Deletar os funcionarios da Lista 
	public String deletaPaciente(Paciente paciente) {
		//Usa o id do paciente para salvar como referencia
		paciente.setId(pacientes.size()-1);
		pacientes.remove(paciente);
		return "Paciente Deletado";
	}

}
