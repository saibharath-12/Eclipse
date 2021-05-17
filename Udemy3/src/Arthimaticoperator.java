
public class Arthimaticoperator {

	public static void main(String[] args) {
		int a = 10;
		int b=20;
		System.out.println(a-- +" "+a);
		System.out.println(a++ +" " + a);
		System.out.println(++b +" "+b);
		System.out.println(--b+" "+b-- +" "+b);
		float x = 346.98f;
		long y = 2345L;
		System.out.println("the sum="+" "+(x+y));
		System.out.println("the sum = "+x+y);;
		
		// casting bigger type to smaller type
		double d =8903.68;
		int z = (int)d+(int)12.9;
		System.out.println(d+z);
		short a1 = 14;
		short a2 = 6;
		double a3 = (double)(a1/a2);
		System.out.println(a3);
		
		int a4 =+6;
		System.out.println("a4 ="+" "+a4);;
		
		boolean a5 = true;
		boolean a6 =!a5;
		System.out.println(a5+" "+a6);
		
		/*
		 * int a7 = !5;// not compile boolean a8 = !5;not compile boolean a9 = -true;
		 * ?//not compile
		 */	
		
		
		int count =0;
		System.out.println("the value ="+ --count + " "+count);
		
		float a7 = 123.65f;
		System.out.println(--a7);
		
//		byte a8 = (byte)true;
//		System.out.println(a8--);
		 int i =1;
		 int j =1;
		 int k = 1<=10?i++:j++;
		 System.out.println(i+" "+i++ +" "+j+" "+k);
		 
		 int a9 = 3;
		 int a10 =6;
		 a9 = a9*a10;
		 a9*=a10;//a9= 18*6
		 System.out.println(a9);
		 
//		 int k *=5;
//		 System.out.println(k); compile tile error
		 
		 long k1 =1L;
		 
		 int k2 =3;
		 k1*=k2;
		 System.out.println(k1);
		 k2*=k1;
		 System.out.println(k2);
		 
		 
//		 long e1= 4;
//		 int e2 =(e1=2); complation error
		 
		 
		 int e1 =4;
		 long e2=(e1=2);
		 System.out.println(e1+" "+e2);
		 
		int f1 = 3;
		int f2 = 4;
		int f3 =9;
		int f4 = 3+4+(f1=5)-3*(f3-=3);
		System.out.println(f4);
		 
		 
		 
		 
		

	}

}
