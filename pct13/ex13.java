package pct13;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);{

			int a, b, c;

			System.out.print("digite 3 lados: ");
			a = receba.nextInt();
			b = receba.nextInt();
			c = receba.nextInt();

			if (a == b && b == c) {
			    System.out.println("equilátero");
			} else if (a == b || a == c || b == c) {
			    System.out.println("isósceles");
			} else {
			    System.out.println("escaleno");
			}
			
			
			
	}

}
}