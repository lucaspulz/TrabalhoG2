package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Paciente;

public class RepositorioPaciente {
	
	public static List<Paciente> pacientes = new ArrayList();
	
	public String salvaPaciente(Paciente paciente) {
		paciente.setId(pacientes.size()+1);
		pacientes.add(paciente);
		return "Paciente Salvo com Sucesso";
	}
	public List<Paciente> findlAll(){
		return pacientes;
	}
	public String deletaPaciente(Paciente paciente) {
		paciente.setId(pacientes.size()-1);
		pacientes.remove(paciente);
		return "Paciente Deletado";
	}

}
