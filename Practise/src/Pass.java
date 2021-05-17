 class Pass {
	 
}
 class C extends Pass{
 }
 class Test3{
	 public void m1(Pass a) {
		 System.out.println("pass");
	 }
	 public void m1(C b) {
		 System.out.println("c");
	 }
	 public static void main(String[] args) {
		  Test t = new Test();
		
		t.m1(a);
		  
		
	 }
 }
 
