package servicos;

import java.util.List;

import javax.swing.JOptionPane;

import entidades.Funcionario;
import repositorio.RepositorioFuncionario;
import util.Uteis;

//Classe para Validar os Campos da função salvar lá da Classe RepositorioFuncionario
public class ServicoFuncionario {
	
	Uteis util = new Uteis();
	//Instancia a Classe repositorioFuncionario para conseguir acessar.
	RepositorioFuncionario repositarioFuncionario;
	
	public ServicoFuncionario() {
		repositarioFuncionario = new RepositorioFuncionario();
	}
	//Validar se os campos Não estão em Branco no Metodo salvaFuncionarioPassando
	//um funcionario como Argumento da classe ServicoFuncionario
		public String salvaFuncionario(Funcionario funcionario) {
			if(Uteis.notNullIsBlank(funcionario.getNome())||funcionario.getContato().getTelefoneCelular()==0||
			   funcionario.getContato().getTelefoneResidencial()==0||funcionario.getContato().getWhatsApp()==0||
			   Uteis.notNullIsBlank(funcionario.getEndereco().getRua())||Uteis.notNullIsBlank(funcionario.getEndereco().getBairro())||
			   Uteis.notNullIsBlank(funcionario.getEndereco().getEstado())||Uteis.notNullIsBlank(funcionario.getEndereco().getCEP())||
			   funcionario.getEndereco().getNumCasa()==0||Uteis.notNullIsBlank(funcionario.getDataNascimento())||
			   Uteis.notNullIsBlank(funcionario.getCpf())||funcionario.getRg()==0||Uteis.notNullIsBlank(funcionario.getCargo())||
			   funcionario.getSalario()==0) {
				JOptionPane.showMessageDialog(null, "Campos Invalidos revizar o Cadastro");
				return null;
				
			}else {
				return repositarioFuncionario.salvaFuncionario(funcionario);
			}
			
			
		}
		
	

}
