package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Developer d1 = new Developer(101,"james gosline","JDBC");
		Developer d2 = new Developer(102,"robert gosline","Spring Framework");
		
		d1.display();
		d1.display1();
		System.out.println();
		d2.display();
		d2.display1();
	}

}
