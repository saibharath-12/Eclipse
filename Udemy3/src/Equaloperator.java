
public class Equaloperator {

	public static void main(String[] args) {
		int a = 2;
		int b= 9;
		boolean c =a==b;
		System.out.println(c);
		boolean d = a!=b;
		System.out.println(d);
		
		//boolean g = true==0; doesn't compile
		//boolean h = false != "eat" doesnt compile
		
		boolean x = true;
		boolean y = false;
		boolean z =(y=true) && (x=false);
		System.out.println(z);
		
		
		
		}

}
