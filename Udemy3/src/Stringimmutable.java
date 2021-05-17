
public class Stringimmutable {

	public static void main(String[] args) {
		String hello = "hello";
		String hi = hello + "world";
		hello = hi;
		System.out.println(hi + hello);
		System.out.println("the output =" +hi);

	   hello.toUpperCase();
	   System.out.println(hello);
	   
	   String s = hello.toUpperCase();
	   System.out.println(s);
	   
	   //concat
	   
	   String s1 = "1";
	   String s2 = s1.concat("2");
	   s2.concat("3");
	   System.out.println(s2);
	   
	   String s11 = "1";
	   String s22 = s11.concat("2");
	  String s3=s22.concat("3");
	   System.out.println(s22+" "+s3);
	   
	   
	}

}
