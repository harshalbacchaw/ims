package Assignment;
import java.util.Scanner;

class Room1 {
	private int roomNo;
	private String roomtype;
	private float roomarea;
	boolean acMachine;
	
	Scanner sc = new Scanner(System.in);
	
	public void setData()
	{
		System.out.println("Enter room no : ");
		roomNo = sc.nextInt();
		System.out.println("Enter room type : ");
		roomtype = sc.next();
		System.out.println("Enetr the room area : ");
		roomarea = sc.nextFloat();
		System.out.println("is the room have AC or not : ");
		acMachine = sc.nextBoolean();
		System.out.println();
	}
	public void displaydata()
	{
		System.out.println("The room No is : "+roomNo);
		System.out.println("The room type is : "+roomtype);
		System.out.println("The room area is : "+roomarea);
		System.out.println("The room has ac or not is : "+acMachine);
	}
}

public class Room
{
	public static void main(String[] args)
	{
		Room1 r = new Room1();
		r.setData();
		r.displaydata();
	}
}
