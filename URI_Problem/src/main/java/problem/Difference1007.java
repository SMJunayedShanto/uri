package problem;

import java.util.Scanner;

public class Difference1007 {

	public static void main(String[] args) {
		
		int a,b,c,d,sum;
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		
		sum = (a*b)-(c*d);

		System.out.printf("DIFERENCA = %d\n",sum);
	}

}
