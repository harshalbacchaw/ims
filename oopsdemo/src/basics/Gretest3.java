package basics;

import java.util.Scanner;

public class Gretest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		if(a>b && a>c)
		{
			System.out.println(a+" is the greatest");
		}
		else if(b>c)
		{
			System.out.println(b+" is the greatest");
		}
		else
		{
			System.out.println(c+" is the greatest");
		}
	}

}
