//int,float,double
//Integer,
public class Wrapperclasses {
	public static void main(String[] args) {
    
	/*public static void main(String[] args) {
	   int i =10;
	   Integer obj = new Integer(1);
	   Integer a =11;
	   Integer b = Integer.valueOf(9);
	   //Integer c = Integer.parseInt(s: "7");
	   Integer d = null;
	   System.out.println(a);
	   System.out.println(b);
	  // System.out.println(c);
	   System.out.println(d);*/
	
	int i = 5;
	Integer ii = new Integer(5);//wrapper class-boxing
	int j = ii.intValue();//unboxing
	System.out.println(j);
	int k =ii;//auto unboxing
	
	
	String str = "213";
	int h = Integer.parseInt(str);
	System.out.println(h);
	
	   
	   

	}

}
