package Assignment;

public interface Truck {
	public String toString();
	public float due_Toll();
}

class FordTruck implements Truck 
{
	private int axels;
	private int weight;
	private float truck_toll_due;
	
	public FordTruck(int axels, int weight)
	{
		this.axels = axels;
		this.weight = weight;
	}
	
	public String toString()
	{
		System.out.println("***************");
		this.truck_toll_due = (this.axels * 5) + ((float)this.weight/1000)*10;
		System.out.println("NEW TRUCK IS ARRIVING");
		
		return "Truck Arrival - Axels : "+this.axels+" Total Weight : "+this.weight+" Toll Due For Current : $"+this.truck_toll_due;
	}
	
	public float due_Toll()
	{
		return this.truck_toll_due;
	}
}

class NisaanTruck implements Truck
{
	private int axels;
	private int weight;
	private float truck_toll_due;
	
	public NisaanTruck(int axels, int weight)
	{
		this.axels = axels;
		this.weight = weight;
	}
	
	public String toString()
	{
		System.out.println("***************");
		this.truck_toll_due = (this.axels * 5) + ((float)this.weight/1000)*10;
		System.out.println("NEW TRUCK IS ARRIVING");
		
		return "Truck Arrival - Axels : "+this.axels+" Total Weight : "+this.weight+" Toll Due For Current : $"+this.truck_toll_due;
	}
	
	public float due_Toll()
	{
		return this.truck_toll_due;
	}
}

class DaewooTruck implements Truck
{
	private int axels;
	private int weight;
	private float truck_toll_due;
	
	public DaewooTruck(int axels, int weight)
	{
		this.axels = axels;
		this.weight = weight;
	}
	
	public String toString()
	{
		System.out.println("***************");
		this.truck_toll_due = (this.axels * 5) + ((float)this.weight/1000)*10;
		System.out.println("NEW TRUCK IS ARRIVING");
		
		return "Truck Arrival - Axels : "+this.axels+" Total Weight : "+this.weight+" Toll Due For Current : $"+this.truck_toll_due;
	}
	
	public float due_Toll()
	{
		return this.truck_toll_due;
	}
}