package Assignment;
import java.util.Scanner;

class Employees1
{
	private float salary;
	private int work_hours;
	
	public Employees1(float salary, int work_hours)
	{
		this.salary = salary;
		this.work_hours = work_hours;
	}
	Scanner sc = new Scanner(System.in);
	
	void getInfo()
	{
		System.out.println("Enter the salary : ");
		salary = sc.nextFloat();
		System.out.println("Enter the work hours per day");
		work_hours = sc.nextInt();
	}
	void AddSal()
	{
		if(salary < 500)
		{
			salary = salary + 10;
		
		System.out.println("the extra amount is added to the salary");
		}
	}
	void AddWork()
	{
		if(work_hours > 6)
		{
			salary = salary + 5;
			System.out.println("extra 5 dollars are added to the salary for extra work");
		}
	}
	void display()
	{
		System.out.println("----Salary Details----");
		System.out.println("The salary of the person is : "+salary);
		System.out.println("The person works "+work_hours+" per day");
	}
}

public class EmployeesSalaryTest {

	public static void main(String[] args) {
		Employees1 e1 = new Employees1(400,7);
		e1.getInfo();
		System.out.println("*******Details******");
		e1.AddSal();
		e1.AddWork();
		e1.display();
	}

}
