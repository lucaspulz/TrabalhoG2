

package aplicacao;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Contato;
import entidades.Doenca;
import entidades.Endereco;
import entidades.Funcionario;
import entidades.Paciente;
import entidades.Quarto;
import entidades.Remedio;
import repositorio.RepositorioFuncionario;
import repositorio.RepositorioPaciente;
import servicos.ServicoDoacao;
import servicos.ServicoFuncionario;
import servicos.ServicoPaciente;
import util.Uteis;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		//Criada para a opção no teclado.
		double opcao;
		//Fazer rodar infinitamente até a que opção seja 5 (While la no Final)
		do {
			//Istanciamento das Classes Necessarias 
			ServicoFuncionario sf = new ServicoFuncionario();
			Funcionario funcionario = new Funcionario();
			Contato contato = new Contato();
			Endereco endereco = new Endereco();
			RepositorioFuncionario rf = new RepositorioFuncionario();
			RepositorioPaciente rp = new RepositorioPaciente();
			Paciente paciente = new Paciente();
			ServicoPaciente sp = new ServicoPaciente();
			Doenca doenca = new Doenca();
			Quarto quarto = new Quarto();
			Remedio remedio = new Remedio();
			ServicoDoacao sd = new ServicoDoacao();
			
			
			
			 opcao = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite:"+
					"\n 1- Cadastro Funcionario"+
					"\n 2- Cadastro Paciente" +
					"\n 3- Listar Paciente ou Funcionario"+
					"\n 4- Fazer Doação para o Hospital"+
					"\n 5- Sair do Programa"));
		// Para Cadastramento do Funcionario
		if(opcao==1) {
			double opcao2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos Funcionarios quer salvar?"));
			for(int i=1;i <=opcao2;i++) {
			
			funcionario.setNome(JOptionPane.showInputDialog(null,"Digite o Nome :"));
			funcionario.setCargo(JOptionPane.showInputDialog(null,"Cargo Funcionario:"));
			contato.setTelefoneCelular(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Seu Telefone Celular:")));
			contato.setTelefoneResidencial(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu Telefone Residencial:")));
			contato.setWhatsApp(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu Whats :")));
			funcionario.setContato(contato);
			funcionario.setCpf(JOptionPane.showInputDialog(null,"Digite CPF:"));
			funcionario.setRg(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o RG:")));
			funcionario.setDataNascimento(JOptionPane.showInputDialog(null,"Digite a Data de Nascimento"));
			endereco.setRua(JOptionPane.showInputDialog(null,"Digite o Nome da Rua : "));
			endereco.setNumCasa(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Numero da Casa ou AP :")));
			endereco.setBairro(JOptionPane.showInputDialog(null,"Digite o Nome do Bairro:"));
			endereco.setCidadeEEstado(JOptionPane.showInputDialog(null,"Digite a Cidade e o Estado :"));
			endereco.setCEP(JOptionPane.showInputDialog(null,"Digite o CEP :"));
			funcionario.setEndereco(endereco);	
			funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Salario :")));
			sf.salvaFuncionario(funcionario);
			
			
		
			
		}
		}
		//Para o Cadastramento de Paciente
		if(opcao==2) {
			double opcao2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos Pacientes quer salvar?"));
			for(int i=1;i <=opcao2;i++) {

			paciente.setNome(JOptionPane.showInputDialog(null,"Digite o Nome :"));
			contato.setTelefoneCelular(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Seu Telefone Celular:")));
			contato.setTelefoneResidencial(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu Telefone Residencial:")));
			contato.setWhatsApp(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu Whats :")));
			paciente.setContato(contato);
			paciente.setCpf(JOptionPane.showInputDialog(null,"Digite CPF:"));
			paciente.setRg(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o RG:")));
			paciente.setDataNascimento(JOptionPane.showInputDialog(null,"Digite a Data de Nascimento"));
			endereco.setRua(JOptionPane.showInputDialog(null,"Digite o Nome da Rua : "));
			endereco.setNumCasa(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Numero da Casa ou AP :")));
			endereco.setBairro(JOptionPane.showInputDialog(null,"Digite o Nome do Bairro:"));
			endereco.setCidadeEEstado(JOptionPane.showInputDialog(null,"Digite a Cidade e o Estado :"));
			endereco.setCEP(JOptionPane.showInputDialog(null,"Digite o CEP :"));
			paciente.setEndereco(endereco);	
			doenca.setNome(JOptionPane.showInputDialog(null,"Nome da Doença :"));
			doenca.setGravidade(JOptionPane.showInputDialog(null,"Gravidade :"));
			doenca.getRemedio().setNome(JOptionPane.showInputDialog(null,"Nome do Remedio :"));
			paciente.setDoenca(doenca);
			quarto.setNumeroQuarto(Integer.parseInt(JOptionPane.showInputDialog(null,"Numero do Quarto: ")));
			quarto.setAndarQuarto(Integer.parseInt(JOptionPane.showInputDialog(null,"Andar do Quarto: ")));
			quarto.setNumeroLeitos(Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos Leitos tem no Quarto: ")));
			paciente.setQuarto(quarto);
			
			paciente.setValor(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Quantidade de Horas que vai fica com o carro Estacionado : (10 Reais por Hora)")));
			sp.salvaPaciente(paciente);
			
			
			
			
			
		}
		}
		//Para Listar as Listas
		if(opcao==3) {
			double opcao3=Double.parseDouble(JOptionPane.showInputDialog(null, "Listar Pacientes ou Funcionarios?"
																		+ "\n 1- Para Funcionarios"
																		+ "\n 2- Para Pacientes"));
			//Listar Funcionarios
			if(opcao3==1) {
				rf.mostraFuncionarios();
			}
			//Listar Pacientes
			else if(opcao3==2) {
				rp.mostraPaciente();
			}
		}
		//Para Fazer Doação  utilizando o metodo com todas assinaturas (Int,Double,Float)
		if(opcao==4) {
			double opcao3=Double.parseDouble(JOptionPane.showInputDialog(null, "Doar : "
					+ "\n 1- Para Dinheiro (Somente Papel)"
					+ "\n 2- Para Cheque"
					+ "\n 3- Para Cartão"));
			if(opcao3==1) {
				
				int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor que quer Doar: "));
				if(valor>0) {
					sd.valorDoado(valor);
					JOptionPane.showMessageDialog(null, "Obrigado pela Doação De : R$ "+valor);
				}else {
					JOptionPane.showMessageDialog(null, "Não pode Doar nada ou Negativo");
				}
				}
			
			if(opcao3==2) {
				
				double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor que quer Doar: "));
				if(valor>0) {
					sd.valorDoado(valor);
					JOptionPane.showMessageDialog(null, "Obrigado pela Doação De : R$ "+valor);
				}else {
					JOptionPane.showMessageDialog(null, "Não pode Doar nada ou Negativo");
				}
				
				}
			if(opcao3==3) {
				
				float valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor que quer Doar: "));
				if(valor>0) {
					sd.valorDoado(valor);
					JOptionPane.showMessageDialog(null, "Obrigado pela Doação De : R$ "+valor);
				}else {
					JOptionPane.showMessageDialog(null, "Não pode Doar nada ou Negativo");
				}
				}
			
		}
		//Para não dar Erro quando Colocar uma das opções Invalidas 
		if(opcao <1 || opcao>5) {
			JOptionPane.showMessageDialog(null, "Por favor Selecione uma Opção Valida");
		}
		//Para sair do Programa
		if(opcao==5) {
			System.exit(0);
			
		//Fazer rodar infinitamente até a que opção seja 5
		}}while(opcao!=5);
		
	}
	

}
