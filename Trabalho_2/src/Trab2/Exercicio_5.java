package Trab2;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int a1 = Scanner.nextInt(),
			a2 = Scanner.nextInt(),
			a3 = Scanner.nextInt(), 
			tempo = 0;

		if (a2 >= a3 && a2 >= a1) {
			tempo = (a3+a1) * 2;
		}else if (a1 >= a3 && a3+a2 <= a1) {
			tempo = (a3*4) + (a2*2);
		} else if (a3 >= a1 && a1+a2 <= a3) {
			tempo = (a1*4) + (a2*2);
		} else {
			tempo = (a3+a1) * 2;
		}
		Scanner.close();
		System.out.println(tempo);
	}
}
