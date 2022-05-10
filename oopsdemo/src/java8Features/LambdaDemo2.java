package java8Features;

public final class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven=(n) -> (n%2==0);
        NumericTest isNegative =(n) ->(n<0);
       
        System.out.println(isEven.computeTestFunction(7));
        System.out.println(isNegative.computeTestFunction(-55));
       
        //boolean a=(n) -> (n%2==0); //error - lambda expressions should be stored in instance of FI
	}

}
