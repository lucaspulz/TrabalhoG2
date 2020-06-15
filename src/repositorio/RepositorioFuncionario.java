package repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Funcionario;

//Classe para  SALVAR,LISTAR Funcionarios
public class RepositorioFuncionario {
	
	//Cria uma Lista de funcionarios 
	public static List<Funcionario> funcionarios = new ArrayList();
	
	//Metodo para salvar funcionarios nesta Lista, depois do mesmo ser populado na Main
	public String salvaFuncionario(Funcionario funcionario) {
		//pega o id para incremento automatico
		funcionario.setId(funcionarios.size()+1);
		funcionarios.add(funcionario);
		return "Salvo com Sucesso";
	}
	
	//Classe para mostrar os Funcionarios  salvos na lista
	public void mostraFuncionarios() {
		String mostra = "Lista de Funcionarios : \n";
		for(Funcionario func : funcionarios) {
			mostra +=("Nome: ".concat(func.getNome()).concat("\n"))
					.concat("Cargo: ".concat(func.getCargo()).concat("\n"))
					.concat("Telefone Celular: ".concat(func.getContato().getTelefoneCelular()+"").concat("\n"))
					.concat("Telefone Residencial: ".concat(func.getContato().getTelefoneResidencial()+"").concat("\n"))
					.concat("Whatsapp: ".concat(func.getContato().getWhatsApp()+"").concat("\n"))
					.concat("CPF: ".concat(func.getCpf()+"").concat("\n"))
					.concat("RG: ".concat(func.getRg()+"").concat("\n"))
					.concat("Data de Nascimento: ".concat(func.getDataNascimento()).concat("\n"))
					.concat("Rua: ".concat(func.getEndereco().getRua()).concat("\n"))
					.concat("Numero da Casa: ".concat(func.getEndereco().getNumCasa()+"").concat("\n"))
					.concat("Bairro: ".concat(func.getEndereco().getBairro()).concat("\n"))
					.concat("Cidade eEstado: ".concat(func.getEndereco().getCidadeEEstado()).concat("\n"))
					.concat("CEP: ".concat(func.getEndereco().getCEP()).concat("\n"))
					.concat("Salario: ".concat(func.getSalario(func.getSalario())+"").concat("\n")
					.concat(" \n"+" ------------------------------------------------------------------- "+"\n"));
					
			
		}
		JOptionPane.showMessageDialog(null, mostra);
	}
	

}
