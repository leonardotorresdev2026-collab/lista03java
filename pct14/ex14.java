package pct14;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);{

			double valor, ipi;
			int quantidade;

			System.out.print("Valor do produto: ");
			valor = receba.nextDouble();

			System.out.print("Quantidade: ");
			quantidade = receba.nextInt();

			System.out.print("IPI (%): ");
			ipi = receba.nextDouble();

			double total = valor * quantidade;
			double totalfinal = total + (total * (ipi / 100));

			System.out.println("Total sem imposto: " + total);
			System.out.println("Total com imposto: " + totalfinal);
	}

}
}