package one;

import java.io.File;
import java.io.IOException;

public class DemoOne {
	
	public static void main(String[] args) throws IOException {
		
		File aa = new File("C:\\Users\\palsa\\Desktop\\aapl");
		
		aa.mkdir();
		System.out.println(aa.getAbsolutePath());
		
		File a  = new File("C:\\Users\\palsa\\Desktop\\aapl\\tt.txt");
		a.createNewFile();
		
	}

}
