package pct08;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);

		String usuario, senha;

		System.out.print("usuario: ");
		usuario = receba.next();

		System.out.print("senha: ");
		senha = receba.next();

		if (usuario.equals("admin") && senha.equals("123")) {
		    System.out.println("acesso permitido");
		} else {
		    System.out.println("acesso negado");
		}
		}
	}

