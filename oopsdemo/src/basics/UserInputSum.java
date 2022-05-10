package basics;
import java.util.Scanner;
//program that adds the number entered by user until the user inputs negative number 
public class UserInputSum {

	public static void main(String[] args) {
		double number,sum=0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numbers ");
		while(true)
		{
			number = input.nextDouble();
			if(number<0.0)
			{
				break;
			}
			sum = sum + number;
		}
		System.out.println("sum : "+sum);
	}

}
