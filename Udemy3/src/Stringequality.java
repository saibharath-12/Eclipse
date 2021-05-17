
public class Stringequality {

	public static void main(String[] args) {
		String a = "sai";
		String a1 = "sai";
		String a2 = "sa"+"i";
		String a4 = new String("sai");
		System.out.println("helo" +a==a1);
		System.out.println((a1=="sai")+"special");
		System.out.println("3"+a==a4);
		System.out.println(" 4"+a4.equals(a1));
		System.out.println("5"+a.equals(a1));
		System.out.println("6"+a.equals(a2));
		
		Integer k =12;
		Integer k1 =12;
		int k4 =12;
		Integer k3 = new Integer(12);
		System.out.println("int=" +k.equals(k1));
		System.out.println("7"+k3.equals(k4));
		System.out.println("8"+k1.equals(k4));
		String k11= "sai";
		//k22=k11.append("kas");
		//System.out.println(k22);
		
		
	
		
		
		//
		Integer b = new Integer(12);
		Integer b1 = new Integer(12);
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
		
//		int b = 12;
//		Integer b1 = new Integer(12);
//		System.out.println(b==b1);
//		System.out.println(b.equals(b1));
		
		
		
		

	}

}
