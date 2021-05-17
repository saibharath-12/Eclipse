import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
	  int x=12;
		
	 
 }
	class Child extends Parent  {
		  int x=14;
			 
		 }
	
    public class Practise{
	public static void main(String[] args)  {
	       Parent obj = new Child();
	        System.out.println(obj.x);
	        
	        Child obj1 = new Child();
	        System.out.println(obj1.x);
	        Parent obj2 = new Parent();
	        System.out.println(obj2.x);

	}
    }
    

