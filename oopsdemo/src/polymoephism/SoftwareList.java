package polymoephism;

import com.wipro.training.microsoft.operatingSystem;
import com.wipro.training.oracle.database;

public class SoftwareList {

	public static void main(String[] args) {
		database d1 = new database();
		d1.printSoftware();
		System.out.println("-----------------------");
		
		operatingSystem o1 = new operatingSystem();
		o1.listSoftware();
	}

}
