
public class Stringmethods {

	public static void main(String[] args) {
		String str = "java is good";
		System.out.println(str.length());
		// char at
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		
		// index of
		System.out.println(" index=" +str.indexOf('a'));
		System.out.println(str.indexOf('a',2));
		System.out.println(str.indexOf("is"));
		System.out.println(str.indexOf("is",10));
		
		//substring
		
		System.out.println("sub string="+str.substring(5));
		System.out.println(str.substring(0,5));
		System.out.println(str.substring(5,5));
		//System.out.println(str.substring(7,5));
		//System.out.println(str.substring(5,15));
		
		System.out.println("ABCD".toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		// equlas and equalsIgnoreCase
		
		String a= "java";
		String a1 = "Java";
		String a2 ="ja";
		System.out.println(a.equalsIgnoreCase(a1));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		
		//start with end with
		System.out.println(a.startsWith("j"));
		System.out.println(a.startsWith("J"));
		System.out.println(a.startsWith(a2));
		System.out.println(a.startsWith(a2.toUpperCase()));
		System.out.println(a.endsWith(a1));
		
		//contains
		System.out.println(a.contains(a2));
		System.out.println(a.contains(a1));
		System.out.println(a.contains(a));
		
		//replace
		System.out.println(a.replace('a','w'));
		//System.out.println(a.replace('a','w'));
		
		//trim
		System.out.println("java is nice".trim());
		System.out.println("   java".trim()); 
		
		
		
		
		
		
	

	}

}
