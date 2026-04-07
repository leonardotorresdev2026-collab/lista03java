package pct5;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);{
			int dia;

			System.out.print("digite um número de 1 a 7: ");
			dia = receba.nextInt();

			switch (dia) {
			    case 1: case 2: case 3: case 4: case 5:
			        System.out.println("dia util");
			        break;
			    case 6: case 7:
			        System.out.println("fim de semana");
			        break;
			    default:
			        System.out.println("invalido");
			}
		}

	}

}
