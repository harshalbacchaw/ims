package basics;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		
		if(a%2==0)
		{
			System.out.println("the number is an even number ");
		}
		else
		{
			System.out.println("the number is an od number ");
		}
	}
}
