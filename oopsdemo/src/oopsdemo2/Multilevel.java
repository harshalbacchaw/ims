package oopsdemo2;

public class Multilevel {

	public static void main(String[] args) {
		AccountDetails a1 = new AccountDetails(21,"Harshal", 500, 50000, 10000, 0);
		AccountDetails a2 = new AccountDetails(22,"Himanshu", 500, 10000, 5000, 2000);
		
		a1.display();
		a2.display();
		
	}

}
