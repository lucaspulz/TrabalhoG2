package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Funcionario;

public class RepositorioFuncionario {
	
	public static List<Funcionario> funcionarios = new ArrayList();
	
	public String salvaFuncionario(Funcionario funcionario) {
		funcionario.setId(funcionarios.size()+1);
		funcionarios.add(funcionario);
		return "Salvo com Sucesso";
	}
	
	public List<Funcionario> findAll(){
		return funcionarios;
	}
	public String deletaFuncionario(Funcionario funcionario) {
		funcionario.setId(funcionarios.size()-1);
		funcionarios.remove(funcionario);
		return "Deletado com Sucesso";
	}

}
