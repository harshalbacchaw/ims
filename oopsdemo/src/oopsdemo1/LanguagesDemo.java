package oopsdemo1;

class Language
{
	private String s;
	Language() //implicit contructor
	{
		System.out.println("I am implicit constructor");
		s = "Python";
		System.out.println("Hello from "+s);
	}
	
	Language(String lang) //parameterized contructor
	{
		System.out.println("I am a parameterized contructor");
		this.s = lang;
		System.out.println("Hello from "+s);
	}
}

public class LanguagesDemo {

	public static void main(String[] args) {
		Language l1 = new Language();				//Automatically invokes implicit constructor
		Language l2 = new Language("Harshal");		//Automatically invokes parameterized constructor
		Language l3 = new Language("Bacchaw");		//Automatically invokes parameterized constructor
		Language l4 = new Language();				//Automatically invokes implicit constructor
	}

}
