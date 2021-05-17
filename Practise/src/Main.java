

	/*class ThrowsExecp
	{
	    static void fun() throws Exception 
	    {
	     if(12<13) {
	    	System.out.println("Inside fun(). ");
	        throw new Exception("demo");
	     }
	    
	    }
	    public static void main(String args[]) 
	    {
	        try
	        {
	            fun();
	        }
	        catch(Exception e)
	        {
	            System.out.println("caught in main.");
	            System.out.println(e.getMessage());
}
	    }
	}

/*public class ThrowsExecp
	{
	    static void fun()
	    {
	        try
	        {
	            throw new NullPointerException("demo");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.println("Caught inside fun().");
	            throw e; // rethrowing the exception
	        }
	    }
	 
	    public static void main(String args[])
	    {
	        try
	        {
	            fun();
	        }
	        catch(NullPointerException e)
	        {
	        	 System.out.println("Caught inside fun().");
	            System.out.println(e.getMessage());
	        }
	    }
	}*/
	class MyException extends Exception
	{
	     MyException(String s)
	    {
        // Call constructor of parent Exception
	        super(s);
	    }
	}
	class Myproblem extends Exception{
		Myproblem(String s1){
			super(s1);
		}
		
	}
	  
	// A Class that uses above MyException
	public class Main
	{
	    // Driver Program
	    public static void main(String args[])
	    {
	        try
	        {
	            // Throw an object of user defined exception
	            throw new MyException("GeeksGeeks");
	            //throw new Myproblem("yes it is mine");
	        }
	        catch (MyException ex)
	        {
	            System.out.println("Caught");
	  
	            // Print the message from MyException object
	            System.out.println(ex.getMessage());
	        }
	        try
	        {
	            // Throw an object of user defined exception
	           // throw new MyException("GeeksGeeks");
	            throw new Myproblem("yes it is mine");
	        }
	        catch (Myproblem ex1)
	        {
	            System.out.println("Caught");
	  
	            // Print the message from MyException object
	            System.out.println(ex1.getMessage());
	        }
	    }
	}
