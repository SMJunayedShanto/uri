package problem;

import java.util.Scanner;

public class TheGreatest1013 {

	public static void main(String[] args) {
		int a,b,c,max;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		//max(a,b) = ((a+b)+abs(a-b))/2
		max = ((a+b)+Math.abs(a-b))/2;
		max = ((max+c)+Math.abs(max-c))/2;
		
		System.out.printf("%d eh o maior\n",max);
	}

}
