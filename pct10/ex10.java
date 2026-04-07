package pct10;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);{
		double imc;

		System.out.print("digite o IMC: ");
		imc = receba.nextDouble();

		if (imc < 18) {
		    System.out.println("magro");
		} else if (imc <= 25) {
		    System.out.println("normal");
		} else {
		    System.out.println("acima do peso");
		}

		}
		}
	}



