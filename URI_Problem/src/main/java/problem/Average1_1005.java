package problem;

import java.util.Scanner;

public class Average1_1005 {

	public static void main(String args[]) {
		
		double a,b,sum;
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextDouble();
		b = s.nextDouble();
		
		a = 3.5*a;
		b = 7.5*b;
		
		sum = (a+b)/(3.5+7.5);
		
		System.out.printf("MEDIA = %.5f\n",sum);
	}
}
