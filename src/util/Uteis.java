package util;

//Classe para Validão de Dados em branco. Faz Polimorfismo também
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


