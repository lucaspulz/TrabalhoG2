package repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Funcionario;
import entidades.Paciente;

//Classe para  SALVAR,DELETAR,LISTAR Pacientes
public class RepositorioPaciente {
	//Cria uma Lista de Paciente
	public static List<Paciente> pacientes = new ArrayList();
	
	//Metodo para salvar Paciente da Na Lista
	public String salvaPaciente(Paciente paciente) {
		//Usa o id do paciente para auto incremento.
		paciente.setId(pacientes.size()+1);
		pacientes.add(paciente);
		return "Paciente Salvo com Sucesso";
	}
	
	//Metodo para mostrar os Pacientes  salvos na lista
	public void mostraPaciente() {
		String mostra = "Lista de Paciente : \n";
		for(Paciente pac : pacientes) {
			mostra +=("Nome: ".concat(pac.getNome()).concat("\n"))
					.concat("Telefone Celular: ".concat(pac.getContato().getTelefoneCelular()+"").concat("\n"))
					.concat("Telefone Residencial: ".concat(pac.getContato().getTelefoneResidencial()+"").concat("\n"))
					.concat("Whatsapp: ".concat(pac.getContato().getWhatsApp()+"").concat("\n"))
					.concat("CPF: ".concat(pac.getCpf()+"").concat("\n"))
					.concat("RG: ".concat(pac.getRg()+"").concat("\n"))
					.concat("Data de Nascimento: ".concat(pac.getDataNascimento()).concat("\n"))
					.concat("Rua: ".concat(pac.getEndereco().getRua()).concat("\n"))
					.concat("Numero da Casa: ".concat(pac.getEndereco().getNumCasa()+"").concat("\n"))
					.concat("Bairro: ".concat(pac.getEndereco().getBairro()).concat("\n"))
					.concat("Cidade e Estado: ".concat(pac.getEndereco().getCidadeEEstado()).concat("\n"))
					.concat("CEP: ".concat(pac.getEndereco().getCEP()).concat("\n"))
					.concat("Nome da Doença: ".concat(pac.getDoenca().getNome()).concat("\n"))
					.concat("Gravidade da Doença: ".concat(pac.getDoenca().getGravidade()).concat("\n"))
					.concat("Nome do Remedio: ".concat(pac.getDoenca().getRemedio().getNome()).concat("\n"))
					.concat("Numero do Quarto: ".concat(pac.getQuarto().getNumeroQuarto()+"").concat("\n"))
					.concat("Andar do Quarto: ".concat(pac.getQuarto().getAndarQuarto()+"").concat("\n"))
					.concat("Numero de Leitos do Quarto: ".concat(pac.getQuarto().getNumeroLeitos()+"").concat("\n"))
					.concat("Valor Estacionamento: ").concat(pac.calculoEstacionamento(pac.getValor())+"").concat("\n")
					.concat(" \n"+" ------------------------------------------------------------------- "+"\n");
					
			
		}
		JOptionPane.showMessageDialog(null, mostra);
	}

}
