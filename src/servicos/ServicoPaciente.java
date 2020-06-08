package servicos;

import javax.swing.JOptionPane;

import entidades.Paciente;
import repositorio.RepositorioPaciente;

public class ServicoPaciente {
	
	RepositorioPaciente repositorioPaciente;
	
	public ServicoPaciente() {
		repositorioPaciente = new RepositorioPaciente();
	}
	public String salvaPaciente(Paciente paciente) {
		if(paciente.getId()==0||paciente.getNome()==null||paciente.getContato()==null||
		   paciente.getEndereco()==null||paciente.getDataNascimento()==null||paciente.getRg()==0||
		   paciente.getCpf()==0||paciente.getDoenca()==null||paciente.getQuarto()==null) {
			JOptionPane.showMessageDialog(null, "Campos Invalidos revizar o Cadastro");
			return null;
			
			}
		return repositorioPaciente.salvaPaciente(paciente);
	}

}
