package problem;

import java.util.Scanner;

public class SimpleSum1003 {

	public static void main(String args[]) {
		int a,b,soma;
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		
		soma= a+b;
		
		System.out.println("SOMA = "+soma);
	}
}
