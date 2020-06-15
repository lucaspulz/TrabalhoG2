package servicos;

import java.util.List;

import javax.swing.JOptionPane;

import entidades.Funcionario;
import entidades.Paciente;
import repositorio.RepositorioPaciente;
import util.Uteis;
//Classe para Validar os Campos da função salvar lá da Classe RepositorioPaciente
public class ServicoPaciente {
	Uteis util = new Uteis();
	//Instancia a Classe repositorioPaciente para conseguir acessar.
	RepositorioPaciente repositorioPaciente;
	
	public ServicoPaciente() {
		repositorioPaciente = new RepositorioPaciente();
	}
	//Validar se os campos Não estão em Branco no Metodo salvaPaciente Passando
	//um paciente como Argumento da classe ServicoPaciente
	public String salvaPaciente(Paciente paciente) {
		if(Uteis.notNullIsBlank(paciente.getNome())||
		   paciente.getContato().getTelefoneCelular()==0||
		   paciente.getContato().getTelefoneResidencial()==0||
		   paciente.getContato().getWhatsApp()==0||
		   Uteis.notNullIsBlank(paciente.getEndereco().getRua())||
		   Uteis.notNullIsBlank(paciente.getEndereco().getBairro())||
		   Uteis.notNullIsBlank(paciente.getEndereco().getCidadeEEstado())||
		   Uteis.notNullIsBlank(paciente.getEndereco().getCEP())||
		   paciente.getEndereco().getNumCasa()==0||
		   Uteis.notNullIsBlank(paciente.getDataNascimento())||
		   paciente.getRg()==0||
		   Uteis.notNullIsBlank(paciente.getCpf())||
		   Uteis.notNullIsBlank(paciente.getDoenca().getNome())||
		   Uteis.notNullIsBlank(paciente.getDoenca().getGravidade())||
		   Uteis.notNullIsBlank(paciente.getDoenca().getRemedio().getNome())||
		   paciente.getQuarto().getNumeroQuarto()==0||
		   paciente.getQuarto().getAndarQuarto()==0||
		   paciente.getQuarto().getNumeroLeitos()==0) {
			
			JOptionPane.showMessageDialog(null, "Campos Invalidos revizar o Cadastro");
			return null;
			
			}
		return repositorioPaciente.salvaPaciente(paciente);
	}
	

}
