package basics;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum;
		float avg;
		System.out.println("hello");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		sum = a + b;
		avg = (float)sum/2;
		System.out.println("the sum is "+sum);
		System.out.println("the average is "+avg);
	}

}
