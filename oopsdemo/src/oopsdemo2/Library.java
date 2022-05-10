package oopsdemo2;
import java.util.List;
//composition example 
public class Library {
	List<Book> books;			//object referance --> composition
	
	public Library(List<Book> books)		//constrictor to initialoize books in library 
	{
		this.books=books;
	}
	
	public List<Book> getBooks()			//getter to get the books from library 
	{
		return books;
	}
	
}
