package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		Trainee t1 = new Trainee();
		t1.display();
		
		Trainee t2 = new Trainee(222,"harshal","python",10000);
		t2.display();
		
		Trainee t3 = new Trainee();
		t3.display();
	}

}
