package abcdacademy;

import java.io.IOException;
import java.util.ArrayList;

public class SampleData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 ExcelData d=  new ExcelData();
		 ArrayList data = d.getData("Add Profile");
		 System.out.println(data.get(0));
		 System.out.println(data.get(1));
		 System.out.println(data.get(2));
		
		 
	}

}
