package one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoTwo {
	
	public static void main(String[] args){
		File ss = new File("C:\\Users\\palsa\\Desktop\\aaplm\\tt.txt");
		Scanner s;
		try {
			s = new Scanner(ss);
			String a=s.nextLine();
			System.out.println(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getClass());
		}
		System.out.println("done");
	}

}
