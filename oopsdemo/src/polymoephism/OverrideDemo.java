package polymoephism;


class SoftwareEngineer
{
	protected String name , tech;
	double salary;
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	
	final void display()
	{
		System.out.println(name+" "+tech+" "+salary);
	}
	
	void work()
	{
		System.out.println("Coding and Testing");
	}
	
}

class Developer extends SoftwareEngineer
{
	public Developer(String name , String tech, double salary )
	{
		super(name,tech,salary);
	}
	void work()			//overridden method 
	{
		System.out.println("coding using : "+tech);
	}
}

class Tester extends SoftwareEngineer
{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
	}
	void work()			//overridden method 
	{
		System.out.println("Testing using : "+tech);
	}
	
}
public class OverrideDemo {

	public static void main(String[] args) {
		SoftwareEngineer s1 = new SoftwareEngineer("Chetan", "C Sharp", 45000);
		Developer d1 = new Developer("Harshal", "Python", 40000);
		Tester t1 = new Tester("Shubham","java",50000);
		
		s1.display();
		s1.work();
		
		d1.display();			//invokes base class method 
		d1.work();				//invokes derived class method 
		
		t1.display();
		t1.work();
	}

}
