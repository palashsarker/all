package one;

import java.util.ArrayList;

public class DemoFour {
	
	public static void main(String[] args) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(0, 400);
		aa.add(1, 4003);
		aa.add(2, 4004);
		
		try{aa.add(3, 555);}
		catch(IndexOutOfBoundsException hh) {
			//System.out.println(hh);
		}
		for(int a:aa) {
		System.out.println(a);
		}
	}

}
