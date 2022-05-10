package oopsdemo2;

class Animal		//parents class //base class  //super class 
{
	String name;	//properties 
	public void eat()	//methods
	{
		System.out.println("I can Eat");
	}
}

class Dog extends Animal	//inherits animal class 
{
	public void display()
	{
		System.out.println("My name is : "+name);
	}
}

public class SingleInheritanceTest {

	public static void main(String[] args) {
			Dog labrador = new Dog();
			
			labrador.name = "Zimba";	//access fields of super class 
			labrador.display();			//call  method of derived class 
			
			labrador.eat();
	}

}
