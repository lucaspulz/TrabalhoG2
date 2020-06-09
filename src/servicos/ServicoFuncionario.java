package servicos;

import javax.swing.JOptionPane;

import entidades.Funcionario;
import repositorio.RepositorioFuncionario;

//Classe para Validar os Campos da função salvar lá da Classe RepositorioFuncionario
public class ServicoFuncionario {
	//Instancia a Classe repositorioFuncionario para conseguir acessar.
	RepositorioFuncionario repositarioFuncionario;
	
	public ServicoFuncionario() {
		repositarioFuncionario = new RepositorioFuncionario();
	}
	//Validar se os campos Não estão em Branco no Metodo salvaFuncionarioPassando
	//um funcionario como Argumento da classe ServicoFuncionario
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
