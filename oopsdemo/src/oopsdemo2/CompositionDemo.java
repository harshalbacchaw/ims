package oopsdemo2;

class Honda extends Car
{
	public void hondaStart()
	{
		Engine heng = new Engine();
		heng.StartEngine();
	}
}
class Hyundai extends Car
{
	public void hyundaiStart()
	{
		Engine heng = new Engine();
		heng.StartEngine();
	}
}
public class CompositionDemo {

	public static void main(String[] args) {
		Honda hondacity = new Honda();
		
		hondacity.setColor("silver");
		hondacity.setMax_speed(120);
		
		System.out.println("----Honda car details ------");
		System.out.println(hondacity.getColor()+" color");
		System.out.println(hondacity.getMax_speed()+" max speed");
		
		hondacity.hondaStart();
	}

}
