package basics;
import java.util.Scanner;
public class multipleORnot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		if(b%a==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
