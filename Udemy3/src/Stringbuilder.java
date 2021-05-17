
public class Stringbuilder {

	public static void main(String[] args) {
		  StringBuilder sb = new StringBuilder("saibharath");
		  StringBuilder sb1 = new StringBuilder("saibharath");
//		  String b="ai";
	  sb.append(sb1);
		  System.out.println(sb);
//		  String b = sb.substring(3, 6);
//		  System.out.println(b);
//		  int a = sb.length();
//		  char ch = sb.charAt(6);
//		  System.out.println(a+" "+ch);
//		   StringBuilder s = new StringBuilder().append("1").append('k');
//		   s.append('o');
//		   s.append(true);
//		   s.append(1);
//		   s.t
//		   System.out.println(s);
//		   s.insert(2, 5);
//		   System.out.println(s);
		   
//		   String s11 = "sai";
//		   String s22 = s11.append("ksa");
//		   System.out.println(s22);
		   
		   
		   sb.delete(1,7);
		   System.out.println(sb);
		   
		   sb.reverse();
		   System.out.println(sb);
		  

	}

}
