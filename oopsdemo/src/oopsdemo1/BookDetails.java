package oopsdemo1;
import java.util.Scanner;
public class BookDetails {
	Scanner sc = new Scanner(System.in);
	int bookNo,edition;
	float price;
	String bookName,author,bookType;
	public void inputDetails()
	{
		System.out.println("enter the number of the book number and edition ");
		bookNo = sc.nextInt();
		edition = sc.nextInt();
		System.out.println("enter book name, author, book type ");
		bookName = sc.nextLine();
		author = sc.nextLine();
		bookType = sc.nextLine();
		System.out.println("enetr the price of the book ");
		price = sc.nextFloat();
		
	}
	public void displayDetails()
	{
		System.out.println("Book No :                  "+bookNo );
		System.out.println("The Name of the book is :  "+bookName);
		System.out.println("Edition of the book is :   "+edition);
		System.out.println("Author of the book is :    "+author);
		System.out.println("The book type is :         "+bookType);
		System.out.println("The price of the book is : "+price);
	}
}
