package Assignment;
import java.util.Scanner;
public class Employees {
	String name;
	int year_of_join;
	String add;
	
	Scanner sc = new Scanner(System.in);
	void input()
	{
		name = sc.next();
		year_of_join = sc.nextInt();
		sc.nextLine();
		add = sc.nextLine();
	}
	
	void display()
	{
		System.out.println("Name \t year_of_join \t address");
		System.out.println(name+ "\t" +year_of_join+ "\t" +add);
	}
}
