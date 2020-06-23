package Trab2;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int n, a = 0, g = 0, d = 0;
		
		while (true) {
			n = Scanner.nextInt();
			if (n > 0 && n < 4) {
				if (n == 1) {
					a++;
				} else if (n == 2) {
					g++;
				} else {
					d++;
				}
			} else if (n == 4) {
				break;
			}
		}
		Scanner.close();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);

	}
}