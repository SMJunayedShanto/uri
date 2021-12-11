package problem;

import java.util.Scanner;

public class AgeinDays1020 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int days,arr[] = {365,30},arr1[] = new int[3];
		
		days = s.nextInt();
		
		for(int i = 0; i<arr.length; i++) {
			arr1[i] = days/arr[i];
			days = days%arr[i];
		}
		arr1[2] = days;
		
		System.out.println(arr1[0]+" ano(s)");
		System.out.println(arr1[1]+" mes(es)");
		System.out.println(arr1[2]+" dia(s)");
	}
}
