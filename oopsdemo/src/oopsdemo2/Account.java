package oopsdemo2;
//multilevel inheritance 
public class Account {
	int accoNo;
	String name;
	
	public Account(int accoNo, String name) {
		this.accoNo = accoNo;
		this.name = name;
	}
	
	void display()
    {
        System.out.println("************ Account Details ************");
        System.out.println("Account Number :"+accoNo);
        System.out.println("Customer Name :"+name);
    }
}
