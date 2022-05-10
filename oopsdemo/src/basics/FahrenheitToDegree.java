package basics;
import java.util.Scanner;
public class FahrenheitToDegree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cel,fah;
		System.out.println("enter the fahrenheit value :");
		fah = sc.nextInt();
		sc.close();
		cel = ((fah - 32)*5)/9;
		System.out.println("the value in celcius is : "+String.format("%.2f",cel));
	}

}
