package util;

//Classe para Valid�o de Dados em branco. Faz Polimorfismo tamb�m
public class Uteis {
	
	public static boolean notNullIsBlank(String dados) {
		if(dados==null) {
			return true;
		}
		if(dados.isBlank()) {
			return true;
		}
		if(dados.isEmpty()) {
			return true;
		}
		return false;
		}
	}


