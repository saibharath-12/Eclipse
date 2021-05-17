

public class Arrays {

	public static void main(String[] args) {
		String[] a = {"sai","bharath"};
		String[] b = a;
		String[] c = {"sai","bharath"};
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//System.out.println(Array.equals(a,b));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
		//System.out.println(Arrays.equals(a,c));
	
		//System.out.println(Arrays.toString(a));
		
		int k[] = new int[9];
		for(int i =0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
		
		int[] a1 = new int[9];
		System.out.println(a1.equals(k));
		System.out.println(a1==k);
		//System.out.println(Arrays.equals(a1,k));
	
		String[] a11 = new String[9];
		for(int i =0;i<a11.length;i++)
		{
			System.out.println(a11[i]);
		}
		
		//enhanced for loop
		
		String[] a2= {"Sai","Bharath","Uha"};
		for(String j:a2)
		{
				System.out.print(" "+j);
		}
		
		char[] ch = {'a','b','b'};
		for(char k33: ch)
		{
			System.out.println(k33);
		}
		
		String[] ss1 = {"sai","Bharath","uha","priya"};
	      k33:for(String k33:ss1)
		{
			if(k33=="uha")
			{
				break k33 ;
			}
			System.out.println(k33);
		}
	      int i =0;
	      while(i<ss1.length)
	      {
	    	  String str =ss1[i];
	    	  i++;
	    	  if(str.equals("uha"))
	    	  {
	    		  continue;
	    		  
	    	  }
	    	  System.out.println(str);
	    	  
	      }
	      
	      //String str = new String("sai","Bharath");
	   //wrapper class is not in string type
	      
	     // Integer a5 = new Integer(1);
            
	      
	    int[] a5 = {2,1,5,48,5,9};
	    System.out.println(a5);
	    int[] a6 = new int[] {1,3,2};
	    
	    
	    
	    
	    
	    
	    
	    
	      
		
		
		
		
	}
		
		

}
