package oopsdemo2;

public class DocorTest {

	public static void main(String[] args) {
		Specialist sp1 = new Specialist(101,"Harshal","Shahada","Heart Surgen");
		sp1.display();
		System.out.println();
		NonSpecialist nsp1 = new NonSpecialist(102,"Bacchaw","Nandurbar");
		nsp1.display();
				
	}

}
