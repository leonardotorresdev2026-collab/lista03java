package pct3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);

		double saldo, credito;

		System.out.print("digite o saldo medio: ");
		saldo = receba.nextDouble();

		if (saldo <= 500) {
		    credito = 0;
		} else if (saldo <= 1000) {
		    credito = saldo * 0.3;
		} else if (saldo <= 3000) {
		    credito = saldo * 0.4;
		} else {
		    credito = saldo * 0.5;
		}

		System.out.println("saldo médio: " + saldo);
		System.out.println("crédito: " + credito);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
