
public class Conditionaloperators {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = a && b;
		boolean f = a||b;
		System.out.println(d+" "+f);
		
		int a1 = 5;
		int a2 =7;
		boolean a3 = (a1-- == 5) && true;
		System.out.println(a3);
		boolean a4 = (a1++ == 4) && true;
		System.out.println(a4+ " "+ a1);
		
		
		int b1 =3;
		int b2 = 7;
	    long b3 = 4;
	    boolean b4 = (b1<b2) && (b2<b3) || (b1<b3);
	    System.out.println(b4);
	    
	    boolean x = true;boolean y= true;
	    int z= 20;
	    x = (z!=10)^(y=false);
	    System.out.println(x);
	    // exculusive or is true when the statements are different
	    
	    
	    
		
		

	}

}
