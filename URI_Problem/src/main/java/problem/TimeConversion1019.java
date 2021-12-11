package problem;

import java.util.Scanner;

public class TimeConversion1019 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n ,t ,arr[] = {3600,60},arr1[] = new int[3];
		
		n = s.nextInt();
		
		for(int i = 0; i<arr.length; i++) {
			t = n/arr[i];
			arr1[i] = t;
			n = n%arr[i];
		}
		arr1[2] = n;
		System.out.println(arr1[0]+":"+arr1[1]+":"+arr1[2]);
		
	}

}
