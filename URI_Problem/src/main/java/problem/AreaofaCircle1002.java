package problem;

import java.util.Scanner;

public class AreaofaCircle1002 {
	
	public static void main(String args[]) {
		double pi = 3.14159,r=0.0;
		
		Scanner s = new Scanner(System.in);
		
		r = s.nextDouble();
		
		System.out.printf("A=%.4f\n", pi*r*r);
	}

}
