package java8Features;
//block lambda expressions
public class LambdaDemo3 {

	public static void main(String[] args) {
		//lambda expression 
		MyString reverseStr = (str1) -> {
            String result="";
            for(int i=str1.length()-1;i>=0;i--)
                result+=str1.charAt(i);
            return result;
        };
       
        System.out.println(reverseStr.MyStringFunction("Lambda EXpressions"));
	}

}
