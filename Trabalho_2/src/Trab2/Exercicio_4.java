package Trab2;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int a = Scanner.nextInt(),
			b = Scanner.nextInt(), 
			c = Scanner.nextInt();

		if (a-b == 0) {
			System.out.println("S");
		} else if (b-c == 0) {
			System.out.println("S");
		} else if (a-c == 0) {
			System.out.println("S");
		} else if (a+c-b == 0) {
			System.out.println("S");
		} else if (a+b-c == 0) {
			System.out.println("S");
		} else if (b+a-c == 0) {
			System.out.println("S");
		} else if (b+c-a == 0) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

	}
}
