package basics;

public class OddEvenDisplay {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Odd\tEven");
		System.out.println("---\t----");
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println("\t"+i);
			}
			else
			{
				System.out.print(i);
			}
			i = i + 1;
		}
	}

}
