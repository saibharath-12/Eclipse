
public class Passing2 {
      int x;
      public int m1(x) {
    	  this.x =x+x*x;
    	  return x;
    	  //System.out.println(t.m1(x));
      }
	public static void main(String[] args) {
		int x =10;
		Passing2 t = new Passing2();
		System.out.println(t.x);
		t.m1(x);
		System.out.println(t.x);
		t.x;
		System.out.println(t.m1(x));
		System.out.println(t.m1(x));
		System.out.println(t.x);
		//System.out.println(t.m1(x));
		

	}

}
