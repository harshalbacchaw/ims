package basics;
import java.util.Scanner;
public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		
		int n,sum=0,i=0;
		
		n = sc.nextInt();
		sc.close();
		while(i<=n)
		{
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("the sum of the series is "+sum);
	}

}
