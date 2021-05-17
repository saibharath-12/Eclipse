
public class Throw {
		
		    static void fun() throws IllegalAccessException
		    {
		        System.out.println("Inside fun(). ");
		        throw new IllegalAccessException("demo");
		    }
		    public static void main(String args[])
		    {
		        try
		        {
		            fun();
		        }
		        catch(ArithmeticException e)
		        {
		            System.out.println("caught in main.");
		        }
		        catch(Exception e)
		        {
		            System.out.println("caught in main.");
		        }
		       /* catch(ArithmeticException e)
		        {
		            System.out.println("caught in main.");
		        }*/
		    }
		
	}


