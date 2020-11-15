package usuarioAvaInter1;

public class Usuario {
	private String login;
	private String senha;
	private String nome;
	private int categoria;

	public Usuario(String login, String senha, int categoria, String nome) {
		this.login = login;
		this.senha = senha;
		this.categoria = categoria;
		this.nome = nome;
	}

	public static String criptografaSenha(String senha) {
		String senhaCriptografada = "";
		char[] caracteres = senha.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			if ((caracteres[i] != '@' && caracteres[i] != '$')) {
				caracteres[i] += 2;
			}
		}
		if (caracteres[0] != '@' && caracteres[0] != '$') {
			caracteres[0] -= 1;
		}
		if (caracteres[caracteres.length - 1] != '@' && caracteres[caracteres.length - 1] != '$') {
			caracteres[caracteres.length - 1] += 1;
		}
		for(int j = 0; j < caracteres.length; j++) {
			senhaCriptografada += caracteres[j];			
		}
		return senhaCriptografada;
	}

	public static String descriptografaSenha(String senhaCripto) {
		String senhaDescriptografada = "";
		char[] caracteres = senhaCripto.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			if ((caracteres[i] != '@' && caracteres[i] != '$')) {
				caracteres[i] -= 2;
			}
		}
		if (caracteres[0] != '@' && caracteres[0] != '$') {
			caracteres[0] += 1;
		}
		if (caracteres[caracteres.length - 1] != '@' && caracteres[caracteres.length - 1] != '$') {
			caracteres[caracteres.length - 1] -= 1;
		}
		for(int j = 0; j < caracteres.length; j++) {
			senhaDescriptografada += caracteres[j];			
		}
		return senhaDescriptografada;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

}
