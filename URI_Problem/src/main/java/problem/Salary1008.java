package problem;

import java.util.Scanner;

public class Salary1008 {

	public static void main(String[]args) {
		int n,wh;
		double r,sum;
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		wh = s.nextInt();
		r = s.nextDouble();
		
		sum = wh*r;
		
		System.out.println("NUMBER = "+n);
		System.out.printf("SALARY = U$ %.2f\n",sum);
	}
}
