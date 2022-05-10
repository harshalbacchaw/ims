package java8Features;
@FunctionalInterface
interface MyFI
{
	public String sayHello();
	//public String sayHello1();	==> error because functional interface should have only one method 
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		 MyFI msg = () -> { return "Hello World ";};	//Lambda expression
		 System.out.println(msg.sayHello());
	}
}
