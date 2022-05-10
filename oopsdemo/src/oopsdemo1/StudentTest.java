package oopsdemo1;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.inputDetails();
		s2.inputDetails();
		s3.inputDetails();
		
		float tot1 = s1.calculate();
		float tot2 = s2.calculate();
		float tot3 = s3.calculate();
		
		s1.displayDetails();
		System.out.println("total displayed from the main "+tot1);
		s2.displayDetails();
		System.out.println("total displayed from the main "+tot2);
		s3.displayDetails();
		System.out.println("total displayed from the main "+tot3);
	}

}
