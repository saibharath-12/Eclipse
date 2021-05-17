public  class Sai {
	
}
public class Variablescope {
	static int a =10;
	static int b = 80;
	

	public static void main(String[] args) {
		System.out.println(b);
		int b= 20;
		{
			{ 
				int c=75;
				{
					int h =87;
					System.out.println(1+" "+c);
					
				}
			}
			int c = 30;
			//int c=76;
			int d = 45;
			System.out.println(2+" "+c);
			System.out.println(a);
		}
		int c =90;
		int d =59;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}

}
