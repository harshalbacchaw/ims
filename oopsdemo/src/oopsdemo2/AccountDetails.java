package oopsdemo2;
/* Multi-Level Inheritance  
 *  Account  --- > SavingsBank ---> AccountDetails
 */

 

//child class of Savings Bank
public class AccountDetails extends SavingsBank {
	int withdrawal,deposite,finalBalance;
	
	public AccountDetails(int accoNo, String name, int mb, int b,int w, int d)
	{
		super(accoNo,name,mb,b);
		this.withdrawal=w;
		this.deposite=d;
	}
	void display()
    {
            super.display(); // invokes savings bank display()method
            System.out.println ("Deposit: "+deposite);
            System.out.println ("Withdrawals: "+withdrawal);
            finalBalance=(balance+deposite)-withdrawal;
            System.out.println("Final Balance:" + finalBalance);
    }
}
