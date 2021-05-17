
  import java.util.ArrayList;

import com.sun.tools.javac.util.List;

import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	/*public class Exceptionhandling
	{
	    public void checkFileNotFound()
	    {
	        try
	        {
	            FileInputStream in = new FileInputStream("input.txt");
	            System.out.println("This is not printed");
	        } 
	        catch (FileNotFoundException fileNotFoundException)
	        {
	            fileNotFoundException.printStackTrace();
	        }
	    }
	    public static void main(String[] args)
	    {
	    	Exceptionhandling example = new Exceptionhandling();
	        example.checkFileNotFound();
	    }
	}*/
	
	/*public class Exceptionhandling{
		public static void main(String[] args) {
			try {
				int k = 10/0;
				System.out.println(k);
				//throw new ArithmeticException("it is not possible");
			}
			catch(Exception e){
				//int y=10/0;
				System.out.println("hlo"+ e);
			}
			finally {
				//int y=10/0;
				//throw new ArithmeticException("it is not possible");
				System.out.println("hai");
				//throw new ArithmeticException("it is not possible");
				//int y=10/0;
			}
			
		}
		
		
	}*/
	public class Exceptionhandling  {
	    public static void main(String[] argv)
	        throws Exception
	    {
	  
	        try {
	  
	            // Creating object of ArrayList<Integer>
	            ArrayList<String>
	                arrlist = new ArrayList<String>();
	  
	            // Populating arrlist1
	            arrlist.add("A");
	            arrlist.add("B");
	            arrlist.add("C");
	            arrlist.add("D");
	            arrlist.add("E");
	  
	            // print arrlist
	            System.out.println("Original arrlist: "
	                               + arrlist);
	  
	            // getting the subList
	            // using subList() method
	            List<String> arrlist2 = arrlist.subList(2, 4);
	  
	            // print the subList
	            System.out.println("Sublist of arrlist: "
	                               + arrlist2);
	        }
	  
	        catch (IndexOutOfBoundsException e) {
	            System.out.println("Exception thrown : " + e);
	        }
	  
	        catch (IllegalArgumentException e) {
	            System.out.println("Exception thrown : " + e);
	        }
	    }
	}
