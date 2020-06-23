package Trab2;
import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		int x = 0;
		x = Scanner.nextInt();
		for(int i=0; i <= x; i++){
			if (i % 2 == 1){
				System.out.println(i);
			}
		}
		Scanner.close();
	}

}
