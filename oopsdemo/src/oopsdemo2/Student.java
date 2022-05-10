package oopsdemo2;

public class Student {
	int rollNo;
	String name;
	Address ad;
	
	public Student(int rollNo, String name, Address ad)
	{
		this.rollNo=rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	void display()
    {
        System.out.println("---------- Student Details ------------");
        System.out.println("Student Id   :"+rollNo );
        System.out.println("Student Name :"+name);

        System.out.println("Address : "+ad.city+" "+ad.country+" "+ad.state+" "+ad.country+" "+ad.pincode);
    }
}
