package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		try { 
			// Creating Writer obj in Append mode -true
			FileWriter writer = new FileWriter("c:/demo/names.txt",true); 
			BufferedWriter bwr = new BufferedWriter(writer);  



			bwr.write("James"); 
			bwr.write("\n"); // bwr.newLine();
			bwr.write("Hobert");
			bwr.write("\n");
			bwr.write("harsh"); 
			bwr.write("\n"); // bwr.newLine();
			bwr.write("patil"); 
			bwr.close(); 



			System.out.println("succesfully written to a file"); } 
		catch (IOException ioe) { 
			ioe.printStackTrace(); 



		}
	}

}
