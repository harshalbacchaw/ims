package basics;
import java.util.Scanner;
public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		if(a>b)
		{
			System.out.println(a+" is the greatest");
		}
		else
		{
			System.out.println(b+" is the greatest");
		}
	}

}
