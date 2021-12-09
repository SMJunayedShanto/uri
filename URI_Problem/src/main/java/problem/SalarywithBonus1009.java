package problem;

import java.util.Scanner;

public class SalarywithBonus1009 {

	public static void main(String[] args) {
		
		String name;
		double salary, saleAmount, totalSalary;

		Scanner s = new Scanner(System.in);
		
		name = s.nextLine();
		salary = s.nextDouble();
		saleAmount = s.nextDouble();
		
		totalSalary = salary+((saleAmount*15)/100);
		
		System.out.printf("TOTAL = R$ %.2f\n",totalSalary);
	}

}
