package polymoephism;

abstract class Animal
{
	public void eat()
	{
		System.out.println("I can Eat");
	}
	
	abstract void makeSound();		//abstract method without body 
	
}
class Dog extends Animal
{
	@Override
	void makeSound() {
		System.out.println("bhow bhow");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("mew mew");
	}
}

public class AnimalAbstractTest {

	public static void main(String[] args) {
		//Animal a1 = new Animal();		//compiler error ---> cannot instantiate the object animal 
		
		Dog d1 = new Dog();
		d1.makeSound();
		d1.eat();
		
		Cat c1 = new Cat();
		c1.makeSound();
		c1.eat();
		
		
	}

}
