package oopsdemo1;

class Lamp
{
	//stores the value of light
	//true if light is on 
	//false if light is off
	boolean isOn;
	//method to turn on the light
	void turnOn()
	{
		isOn = true;
		System.out.println("Light on ?"+isOn);
	}
	
	//method to turn off the light
		void turnOff()
		{
			isOn = false;
			System.out.println("Light on ?"+isOn);
		}
}
public class LampTest {

	public static void main(String[] args) {
		//create object led and halogen 
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//switch On led and halogen 
		led.turnOn();
		halogen.turnOn();
		
		//switch off led and halogen
		led.turnOff();
		halogen.turnOff();
	}

}
