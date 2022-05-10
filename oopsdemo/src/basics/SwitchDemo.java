package basics;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		int a,b,res;
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("enter the opeation");
		op = sc.next();
		sc.close();
		
		switch(op)
		{
		case "+": res = a + b;
		System.out.println("the addition is "+res);
		break;
		
		case "-": res = a - b;
		System.out.println("the substraction is "+res);
		break;
		
		case "*": res = a * b;
		System.out.println("the multiplication is "+res);
		break;
		
		case "/": res = a / b;
		System.out.println("the division is "+res);
		break;
		
		default :
			System.out.println("the invalid operator");
		}
	}

}
