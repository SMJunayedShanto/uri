package problem;

import java.util.Scanner;

public class SimpleCalculate1010 {

	public static void main(String[] args) {
		
		int prodCode[]= new int[2],unit[]= new int[2];
		double price[]= new double[2],sum = 0.0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i<2; i++) {
			prodCode[i] = s.nextInt();
			unit[i] = s.nextInt();
			price[i] = s.nextDouble();
			
			sum+=unit[i]*price[i];
		}

		System.out.printf("VALOR A PAGAR: R$ %.2f\n",sum);
	}

}
