package basics;
import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float area,r;
		final float pi=3.14f;
		System.out.println("enter the radius of the circle");
		r = sc.nextFloat();
		sc.close();
		
		area = pi*r*r;
		System.out.println("the area OF the circle is "+String.format("%.1f",area));
	}

}
