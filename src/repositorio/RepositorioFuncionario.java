package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Funcionario;

//Classe para  SALVAR,DELETAR,LISTAR Funcionarios
public class RepositorioFuncionario {
	
	//Cria uma Lista de funcionarios 
	public static List<Funcionario> funcionarios = new ArrayList();
	
	//Metodo para salvar funcionarios nesta Lista, depois do mesmo ser populado na Main
	public String salvaFuncionario(Funcionario funcionario) {
		//pega o id para add como referencia.
		funcionario.setId(funcionarios.size()+1);
		funcionarios.add(funcionario);
		return "Salvo com Sucesso";
	}
	//Metodo para Listar os Funcionario da Lista 
	public List<Funcionario> findAll(){
		return funcionarios;
	}
	//Metodo para Deletar os funcionarios da Lista 
	public String deletaFuncionario(Funcionario funcionario) {
		//pega o id para deletar
		funcionario.setId(funcionarios.size()-1);
		funcionarios.remove(funcionario);
		return "Deletado com Sucesso";
	}

}
