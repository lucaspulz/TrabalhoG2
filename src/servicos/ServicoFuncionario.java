package servicos;

import javax.swing.JOptionPane;

import entidades.Funcionario;
import repositorio.RepositorioFuncionario;

public class ServicoFuncionario {
	
	RepositorioFuncionario repositarioFuncionario;
	
	public ServicoFuncionario() {
		repositarioFuncionario = new RepositorioFuncionario();
	}
		public String salvaFuncionario(Funcionario funcionario) {
			if(funcionario.getId()==0 || funcionario.getNome()==null||funcionario.getContato()==null||
			   funcionario.getEndereco()==null||funcionario.getDataNascimento()==null||
			   funcionario.getRg()==0||funcionario.getCpf()==0||funcionario.getCargo()==null||
			   funcionario.getSalario()==0) {
				JOptionPane.showMessageDialog(null, "Campos Invalidos revizar o Cadastro");
				return null;
				
			}
			return repositarioFuncionario.salvaFuncionario(funcionario);
			
		}
	

}
