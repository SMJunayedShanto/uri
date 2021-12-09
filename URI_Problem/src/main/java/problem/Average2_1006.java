package problem;

import java.util.Scanner;

public class Average2_1006 {

	public static void main(String[] args) {

		double a,b,c,sum;
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		a = a*2;
		b = b*3;
		c = c*5;
		
		sum = (a+b+c)/(2+3+5);
		
		System.out.printf("MEDIA = %.1f\n",sum);
		
	}

}
