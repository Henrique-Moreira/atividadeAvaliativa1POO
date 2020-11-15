package livroAvaInter1;

public class Livro {
	private int codigo;
	private String nome;
	private String editora;
	private String autor;
	private int ano;
	
	public Livro(int codigo, String nome, String editora, String autor, int ano) {
		this.codigo = codigo;
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.ano = ano;
	}
	
	public static String exibeBibliografia(String nome, String editora, String autor, int ano) {
		String bibliografia;
		String[] nomesAutor;
		nomesAutor = autor.split(" ");
		String ultimoNome = nomesAutor[nomesAutor.length - 1];
		bibliografia = ultimoNome + " ";
		for(int i = 0; i < nomesAutor.length-1; i++) {
			bibliografia += nomesAutor[i].charAt(0) + ". ";
		}
		bibliografia += nome + ". " + "Ed. " + editora + ". " + ano + ".";
		return bibliografia;
	}
}