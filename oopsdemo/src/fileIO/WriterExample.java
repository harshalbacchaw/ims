package fileIO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//writer class is used to write String/text data into a text file
public class WriterExample {

	public static void main(String[] args) {
		try 
		{
			Writer w = new FileWriter("c:/demo/data.txt");
			String content = "She sells sea shells in the sea, it is the program by Harshal bacchaw ";
			w.write(content);
			w.close();
			System.out.println("data written to the file");
		}
		catch(IOException e)
		{
			System.err.println("Error Occured");
			e.printStackTrace();
			
		}
		
	}

}
