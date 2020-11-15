package avaInter1_HenriqueMoreiraAmorim;

import java.util.Scanner;

import livroAvaInter1.Livro;
import usuarioAvaInter1.Usuario;

public class AppAvaInter1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String login, senha, nome, senhaConfirma;
		int categoria;
		
		do {
			System.out.print("Login: ");
			login = sc.nextLine();

			System.out.print("Senha: ");
			senha = sc.nextLine();
			
			System.out.print("Categoria: ");
			categoria = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.println();

		} while (Validacao.validaLogin(login) == false || Validacao.validaSenha(senha) == false);
		
		System.out.println("Login validado");
		String senhaCripto = Usuario.criptografaSenha(senha);
		Usuario user = new Usuario(login, senhaCripto, categoria, nome);
		
		do {
		System.out.print("Insira novamente seu login: ");
		login = sc.nextLine();
		System.out.print("Insira novamente a sua senha: ");
		senhaConfirma = sc.nextLine();
		
		} while (senhaConfirma.equals(Usuario.descriptografaSenha(senhaCripto)) == false);
		
		if(senhaConfirma.equals(Usuario.descriptografaSenha(senhaCripto))) {
			System.out.println();
			System.out.println("CADASTRO DE LIVRO");
			
			System.out.print("Insira o código do livro: ");
			int codigoLivro = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Insira o nome do livro: ");
			String nomeLivro = sc.nextLine();

			
			System.out.print("Insira a editora do livro: ");
			String editoraLivro = sc.nextLine();

				
			System.out.print("Insira o autor do livro: ");
			String autorLivro = sc.nextLine();

			
			System.out.print("Insira o ano do livro: ");
			int anoLivro = sc.nextInt();
			sc.nextLine();
			
			Livro book = new Livro(codigoLivro, nomeLivro, editoraLivro, autorLivro, anoLivro);
			String bibliografiaLivro = Livro.exibeBibliografia(nomeLivro, editoraLivro, autorLivro, anoLivro);
			System.out.println(bibliografiaLivro);
		}
	}

}
