package Assignment;

public interface TollBooth {
	public void calculateToll(Truck truck);
	public void calculate(Truck truck);
	public void displayTotalCollection();
	public void resetToll();
}

class SongirTollBooth implements TollBooth
{
	private int total_truck;
	private float total_collection;
	Truck truck;
	
	public void calculateToll(Truck truck)
	{
		System.out.println(truck);
	}
	
	public void calculate(Truck truck)
	{
		this.total_collection = this.total_collection + truck.due_Toll();
		this.total_truck = this.total_truck + 1;
	}
	
	public void displayTotalCollection()
	{
		System.out.println("Total since last collection - Receipts : $"+this.total_collection+" Truck : "+this.total_truck);
		System.out.println();
	}
	
	public void resetToll()
	{
		this.total_collection = 0;
		this.total_truck = 0;
		System.out.println("********RESETING********");
		System.out.println("Truck Count After Reset : "+this.total_truck);
		System.out.println("Collection Value After Reset : "+this.total_collection);
	}
}
