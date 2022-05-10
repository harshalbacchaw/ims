package miscelaneous;

class Sample<T>  // Parameterized class/ Generic class
{
    private T data;   // generic variable declaration

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}   
}

public class GenericClassDemo {

	public static void main(String[] args) {
		Sample<String> 	s1 = new Sample<String>("Java Generics");	//object of generic class of type string
		System.out.println(s1.getData());
		Sample<Integer> s2 = new Sample<Integer>(200);
		System.out.println(s2.getData());
		Sample<Double> s3 = new Sample<Double>(555.50);
		System.out.println(s3.getData());
	}

}
