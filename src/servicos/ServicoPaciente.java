package servicos;

import javax.swing.JOptionPane;

import entidades.Paciente;
import repositorio.RepositorioPaciente;
//Classe para Validar os Campos da função salvar lá da Classe RepositorioPaciente
public class ServicoPaciente {
	//Instancia a Classe repositorioPaciente para conseguir acessar.
	RepositorioPaciente repositorioPaciente;
	
	public ServicoPaciente() {
		repositorioPaciente = new RepositorioPaciente();
	}
	//Validar se os campos Não estão em Branco no Metodo salvaPaciente Passando
	//um paciente como Argumento da classe ServicoPaciente
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
