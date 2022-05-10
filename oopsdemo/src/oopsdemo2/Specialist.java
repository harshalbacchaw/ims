package oopsdemo2;

public class Specialist extends Doctor {
	String speciality;
	public Specialist(int idNumber , String name, String address, String sp)
	{
		super(idNumber,name,address);
		this.speciality=sp;
	}
	
	void display()
	{
		super.display();
		System.out.println("The speciality is : "+speciality);
	}

}
