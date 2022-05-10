package Assignment;
import java.util.Scanner;
public class Students {
	String name;
	
	Scanner sc = new Scanner(System.in);
	public void setData()
	{
		System.out.println("Enter the name of the student ");
		name = sc.nextLine();
		
	}
	
	public void display()
	{
		if(name.length()>0)
		{
			System.out.println("the name is : "+name);
		}
		else
		{
			System.out.println("Unknown");
		}
	}
}
