package oopsdemo1;

public class PersonTest1 {

	public static void main(String[] args) {
		PersonTest objperson1 = new PersonTest();		//invoke implicit constructor
		
		objperson1.input();
		objperson1.print();
		
		PersonTest objperson2 = new PersonTest("Mike",22);
		objperson2.print();
		
		System.out.println("-------------------------------------");
        PersonTest objPerson3 = new PersonTest("Ravi","Delhi",60); // invokes constructor with 3 args
       
        objPerson3.print();
		
	}

}
