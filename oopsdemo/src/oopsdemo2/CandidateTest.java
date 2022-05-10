package oopsdemo2;

public class CandidateTest {

	public static void main(String[] args) {
		JavaCandidate jc1 = new JavaCandidate(101, "Harshal", 45000,"Spring");
		jc1.display();
		jc1.getperks();
		System.out.println();
		AccountCandidate ac1 = new AccountCandidate(102, "Himanshu", 50000);
		ac1.display();
		ac1.getperks();
	}

}
