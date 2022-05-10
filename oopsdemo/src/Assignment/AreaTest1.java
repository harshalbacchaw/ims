package Assignment;

class Rectangle
{
	private float length, breadth;
	float area;
	public Rectangle(float length, float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void Area()
	{
		area = length*breadth;
		System.out.println("The are of the rectangle is : "+area);
		System.out.println("Its length is : "+length);
		System.out.println("Its breadt is : "+breadth);
	}
}

public class AreaTest1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		
		r1.Area();
		r2.Area();
	}

}
