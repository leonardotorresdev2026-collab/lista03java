package pct06;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
	
		Scanner receba = new Scanner(System.in);{

			double num1, num2;
			char resultado;

			System.out.print("digite dois numeros: ");
			num1 = receba.nextDouble();
			num2 = receba.nextDouble();

			System.out.print("operaçao +, -, *,/ ");
			resultado = receba.next().charAt(0);

			switch (resultado) {
			    case '+': System.out.println(num1 + num2); break;
			    case '-': System.out.println(num1 - num2); break;
			    case '*': System.out.println(num1 * num2); break;
			    case '/': System.out.println(num1 / num2); break;
			    default: System.out.println("operaçao invalida");
			}
	}

}
}