package problem;

import java.util.Scanner;

public class Sphere1011 {

	public static void main(String[] args) {

		final double pi = 3.14159;
		double r,sum;
		Scanner s = new Scanner(System.in);
		
		r = s.nextDouble();
		sum = (4.0/3)*pi*r*r*r;
		
		System.out.printf("VOLUME = %.3f\n",sum);
	}

}
