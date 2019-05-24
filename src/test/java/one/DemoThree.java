package one;

public class DemoThree {
	
	public static void main(String[] args) {
		String a="pal99";
		try{int aa=Integer.parseInt(a);
		System.out.println(aa);
		}
		catch(NumberFormatException jj) {
			System.out.println(jj);
		}
		System.out.println("done");
	}

}
