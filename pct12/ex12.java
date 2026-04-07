package pct12;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);{

			int num;

			System.out.print("digite um número: ");
			num = receba.nextInt();

			if (num % 3 == 0 && num % 5 == 0) {
			    System.out.println("multiplo de 3 e 5");
			} else if (num % 3 == 0) {
			    System.out.println("multiplo de 3");
			} else if (num % 5 == 0) {
			    System.out.println(" multiplo de 5");
			} else {
			    System.out.println("nenhum");
			}
	}

}
}