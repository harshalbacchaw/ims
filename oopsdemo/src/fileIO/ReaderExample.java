package fileIO;
import java.io.Reader;
import java.io.FileReader;

//reader class is used to read string/text data from a file 
public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("c:/demo/data.txt");
			int data = reader.read();  // returns unicodevalue of character
			while (data != -1) {  // -1 when stream ends
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}
