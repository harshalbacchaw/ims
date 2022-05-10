package Assignment;

public class TollBoothAssignment {

	public static void main(String[] args) {
		TollBooth booth = new SongirTollBooth();
		
		Truck ford = new FordTruck(5, 12000);
		Truck nisaan = new NisaanTruck(2, 5000);
		Truck daewoo = new DaewooTruck(6, 17000);
		Truck tata = new DaewooTruck(10, 15000);
		
		booth.calculateToll(ford);
		booth.calculate(ford);
		booth.displayTotalCollection();
		
		booth.calculateToll(nisaan);
		booth.calculate(nisaan);
		booth.displayTotalCollection();
		
		booth.calculateToll(daewoo);
		booth.calculate(daewoo);
		booth.displayTotalCollection();
		
		booth.calculateToll(tata);
		booth.calculate(tata);
		booth.displayTotalCollection();
		

		
		booth.resetToll();
	}

}
