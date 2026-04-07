package pct01;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
	Scanner  receba = new Scanner(System.in);

	        System.out.print("digite um número inteiro: ");
	        int num = receba.nextInt();

	        if (num % 10 == 0) {
	            System.out.println("divisível por 10");
	        } else if (num % 5 == 0) {
	            System.out.println("divisível por 5");
	        } else if (num % 2 == 0) {
	            System.out.println("divisível por 2");
	        } else {
	            System.out.println("não é divisível por 10, 5 ou 2");
	        }
	    }
	}