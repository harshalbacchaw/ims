package oopsdemo1;

public class Book2Test {

	public static void main(String[] args) {
		Book2 b1 = new Book2();
		
		//invoke setters methods 
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");
		
		//invoke getters methods ==output
		System.out.println("******* Book Details ********");
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("Discounted price of book "+b1.discountPrice());
		System.out.println(b1);
		
		System.out.println();
		
		Book2 b2=new Book2();
	       
        b2.setBookId(102);
        b2.setBookName("Python");
        b2.setPrice(600);
        b2.setPublisher("BPB Publisher");
       
        System.out.println("******* Book Details ********");
        System.out.println(b2.getBookId()+ " "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
        System.out.println("Discounted Price of Book :"+b2.discountPrice()); 
        System.out.println(b2);
	}

}
