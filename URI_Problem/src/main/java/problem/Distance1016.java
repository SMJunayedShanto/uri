package problem;

import java.util.Scanner;

public class Distance1016 {

	public static void main(String[] args) {
		int distance,time;
		
		Scanner s = new Scanner(System.in);
		
		distance = s.nextInt();
		
		time = 2*distance;
		
		System.out.printf("%d minutos\n", time);
	}

}
