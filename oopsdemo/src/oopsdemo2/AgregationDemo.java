package oopsdemo2;

public class AgregationDemo {

	public static void main(String[] args) {
		Address ad1 = new Address("pune","maharashtra","India",425403);
		Address ad2 = new Address("mumbai", "maharashtra", "India", 425401);
		
		Student s1 = new Student(35, "Harshal", ad1);
		Student s2 = new Student(36, "Himanshu", ad2);
		
		s1.display();
		System.out.println();
		s2.display();
	}

}
