package sai;
abstract  class A{
	
	abstract void m1();
    abstract void m2();
    void m3(){
   	System.out.println("helloA");
    }	
}
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
 class Test1 {
	
	 public static void main(String[] args) {
		// B b = new B1();

				   B1 b = new B1();
				   
	   ((C)b).m2();
	  ((B)b).m1();
	   b.m3();
		  // System.out.println(A.x);
		   
		 
	 }
 }
