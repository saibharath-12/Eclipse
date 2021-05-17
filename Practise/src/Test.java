bstract  class A{
	
	abstract void m1();
    abstract void m2();
    void m3(){
   	System.out.println("helloA");
    }	
}a
abstract class B extends A{
	void m1() {
		System.out.println("helloB");
	}
}
abstract class C extends B{
	void m2() {
		System.out.println("helloC");
	}
}

class B1 extends C {
  void m2() {
	  System.out.println("helloB1");
	}
}
 class Test {
	
	 public static void main(String[] args) {

				   B1 b = new B1();
	   b.m2();
	   b.m1();
	   b.m3();
		  // System.out.println(A.x);
		   
		 
	 }
 }

