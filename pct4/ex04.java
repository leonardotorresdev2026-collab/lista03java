package pct4;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
	
		Scanner receba = new Scanner(System.in);

		int prato, sobremesa, bebida;
		int total = 0;

		System.out.println("prato (1-vegetariano, 2-peixe, 3-frango, 4-carne): ");
		prato = receba.nextInt();

		System.out.println("sobremesa (1-abacaxi, 2-sorvete, 3-mousse diet, 4-mousse chocolate): ");
		sobremesa = receba.nextInt();

		System.out.println("bebida (1-cha, 2-laranja, 3-melao, 4-refri diet): ");
		bebida = receba.nextInt();

		if (prato == 1) total += 180;
		else if (prato == 2) total += 230;
		else if (prato == 3) total += 250;
		else total += 350;

	
		if (sobremesa == 1) total += 75;
		else if (sobremesa == 2) total += 110;
		else if (sobremesa == 3) total += 170;
		else total += 200;

	
		if (bebida == 1) total += 20;
		else if (bebida == 2) total += 70;
		else if (bebida == 3) total += 100;
		else total += 65;

		System.out.println("total de calorias: " + total);

	}

}
