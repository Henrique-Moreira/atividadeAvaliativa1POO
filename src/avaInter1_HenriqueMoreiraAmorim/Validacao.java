package avaInter1_HenriqueMoreiraAmorim;

public class Validacao {
	public static boolean validaLogin(String login) {
		if(login.length() < 5 && login.length() > 20) {
			return false;
		}
		else if (login.contains("@") || login.contains("$") || login.contains(" ")) {
			return false;
		}
		else {
			return true;			
		}
	}
	public static boolean validaSenha(String senha) {
		if((senha.length() >= 8 && senha.length() <= 15) && (senha.contains("@") || senha.contains("$"))) {
			return true;
		}
		else {
			return false;
		}
	}
}
