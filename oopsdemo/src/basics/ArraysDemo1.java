package basics;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the length of the array ");
		n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("enetr the array elements : ");
		for(int j=0;j<n;j++)
		{
			num[j] = sc.nextInt();
		}
		sc.close();
		System.out.println("the elements of the new array are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
	}

}
