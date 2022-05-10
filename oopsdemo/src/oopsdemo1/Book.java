package oopsdemo1;
import java.util.Scanner;

class Book1{
	String bookName;
	String author;
	int editionNumber;
	int price;
	
	Scanner s = new Scanner(System.in);
	
	void inputBookDetails() {
		System.out.println("Enter Book Title:");
		bookName = s.nextLine();
		System.out.println("Enter Author Name:");
		author = s.nextLine();
		System.out.println("Enter Edition Number:");
		editionNumber = s.nextInt();
		System.out.println("Enter Price:");
		price = s.nextInt();
	}
	
	void displayBookDetails(){
		System.out.println("------- Book Details -------");
		System.out.println("Book Name:-"+bookName);
		System.out.println("Author Name:-"+author);
		System.out.println("Edition Number:-"+editionNumber);
		System.out.println("Price:-"+price);
	}

}
public class Book {
	
	public static void main(String[] args) {
		Book1 b = new Book1();
		b.inputBookDetails();
		b.displayBookDetails();
	}
}
