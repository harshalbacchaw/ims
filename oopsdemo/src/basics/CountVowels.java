package basics;

public class CountVowels {
	public static void main(String[] args) {
		String s = "java is fun";
		int count = 0;
		System.out.println("the len of the string is "+s.length());
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count = count + 1;
				System.out.println("Vowel found "+s.charAt(i));
			}
		}
		System.out.println("the total vowels are "+count);
	}
}
