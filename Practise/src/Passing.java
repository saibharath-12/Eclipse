
public class Passing {
	 int x;
	Passing(int x)
	{
		m1(x);
	}
	public static int m1(int x)
	{
	     x= 3*x;
	     return x;
	}
	public static void main(String[] args) {
		int x =10;
		Passing d = new Passing(10);
		//System.out.println(x);
		System.out.println(d.x);
	//	int x =10;
		
		System.out.println(d.m1(x));
		

	}

}
