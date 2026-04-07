package pct07;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
	
		Scanner receba = new Scanner(System.in);{
			
			double valor;

			System.out.print("digite o valor: ");
			valor = receba.nextDouble();

			double finalvalor = (valor > 100) ? valor * 0.9 : valor;

			System.out.println("valor final: " + finalvalor);
			
			
	}

}
}