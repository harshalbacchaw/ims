package basics;
import java.util.Scanner;
public class TernaryDemo {

	public static void main(String[] args) {
		int a,b,max;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		max = (a>b)?a:b;
		String msg = (a>b)?" is the greatest":" is the greatest";
		System.out.println(max + msg);
	}

}
