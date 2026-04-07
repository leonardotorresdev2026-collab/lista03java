package pct09;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
	
		Scanner receba = new Scanner(System.in);{

			int num;

			System.out.print("digite um numero: ");
			num = receba.nextInt();

			String resp = (num >= 10 && num <= 50) ? "dentro do intervalo" : "fora do intervalo";

			System.out.println(resp);
	}

}
}