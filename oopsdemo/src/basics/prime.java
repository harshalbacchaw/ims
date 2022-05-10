package basics;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int count=0, last;
		last = (a)-2;
		for(int i=2; i<=a; i++){
			if(a % i == 0) {
				break;
			}
			else {
				count = count + 1;
			}
		}
		if(last == count) {
			System.out.println("this is a prime number");
		}
		else {
			System.out.println("its not");
		}
	}
}
