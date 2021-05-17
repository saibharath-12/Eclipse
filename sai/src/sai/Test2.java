package sai;

public class Test2 {
      int b=10;
      static int c=14;
      int a= 56;
      {
    	  System.out.println("hai");
      }
      Test2(){
    	  System.out.println("rebel");
      }
	public static void main(String[] args) {
		{
			System.out.println("ravi");
		}
        int a =12;
        System.out.println(a);
        Test2 obj = new Test2();
        Test2 obj2 = new Test2();
        System.out.println(obj.b);
        System.out.println(obj.a);
        //System.out.println(a);
        System.out.println(c);
        
	}

}
