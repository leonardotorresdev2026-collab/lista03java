package pct11;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);{

		int saldo;

		System.out.println("1 ver saldo");
		System.out.println("2 depositar");
		System.out.println("3 sair");
		saldo = receba.nextInt();

		switch (saldo) {
		    case 1: System.out.println("saldo"); break;
		    case 2: System.out.println("depósito"); break;
		    case 3: System.out.println("saindo"); break;
		    default: System.out.println("opçao inválida");
		}

	}

	}
	}
