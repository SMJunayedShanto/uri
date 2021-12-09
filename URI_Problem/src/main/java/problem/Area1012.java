package problem;

import java.util.Scanner;

public class Area1012 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double a,b,c,sum;
		
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		// TODO the area of the rectangled triangle that has base A and height C.
		//area of rectangle = base*height;
		//area of the rectangled triangle = (base*height)/2;
		sum = (a*c)/2;
		System.out.printf("TRIANGULO: %.3f\n",sum);
		
		// TODO the area of the radius's circle C. (pi = 3.14159)
		//area of the radius's circle C = pi*r*r
		final double pi = 3.14159;
		sum = pi*c*c;
		System.out.printf("CIRCULO: %.3f\n",sum);
		
		// TODO the area of the trapezium which has A and B by base, and C by height.
		//the area of the trapezium which has A and B by base, and C by height = ((a+b)/2)*c;
		sum = ((a+b)/2)*c;
		System.out.printf("TRAPEZIO: %.3f\n",sum);
		
		// TODO the area of ​​the square that has side B.
		//the area of ​​the square that has side B = b*b
		sum = b*b;
		System.out.printf("QUADRADO: %.3f\n",sum);
		
		// TODO the area of the rectangle that has sides A and B.
		sum = a*b;
		System.out.printf("RETANGULO: %.3f\n",sum);

	}

}
