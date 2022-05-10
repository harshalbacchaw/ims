package Assignment;
import java.util.Scanner;

class Area
{
	private float length, breadth;
	float area;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the length : ");
		length = sc.nextFloat();
		System.out.println("Enter the breadth : ");
		breadth = sc.nextFloat();
	}
	void returnArea()
	{
		area = length*breadth;
		System.out.println("The area of the rectangle is : "+area);
	}
}

public class AreaTest {

	public static void main(String[] args) {
		Area a1 = new Area();
		a1.input();
		a1.returnArea();
	}

}
