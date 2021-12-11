package problem;

import java.util.Scanner;

public class Consumption1014 {
	public static void main(String[]args) {
		double fuel,distance,lPerKm;
		
		Scanner s = new Scanner(System.in);
		
		distance = s.nextDouble();
		fuel = s.nextDouble();
		lPerKm = distance/fuel;
		
		System.out.printf("%.3f km/l\n",lPerKm);
	}
}
