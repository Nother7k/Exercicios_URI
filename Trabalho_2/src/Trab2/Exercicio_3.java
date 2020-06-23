package Trab2;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		while (true) {
			int a = Scanner.nextInt();
			int b = Scanner.nextInt();
			if (a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}
}
