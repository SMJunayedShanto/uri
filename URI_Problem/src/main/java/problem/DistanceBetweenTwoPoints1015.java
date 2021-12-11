package problem;

import java.util.Scanner;

public class DistanceBetweenTwoPoints1015 {

	public static void main(String[] args) {

		double x1,x2,y1,y2,distance;
		
		Scanner s = new Scanner(System.in);
		
		x1 = s.nextDouble();
		y1 = s.nextDouble();
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		
		//distance = ((x2-x1)^2+(y2-y1)^2)^.5
		distance = Math.pow((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)), .5);
		
		System.out.printf("%.4f\n",distance);
	}

}
