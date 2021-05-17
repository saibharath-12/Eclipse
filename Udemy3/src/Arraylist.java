import java.util.ArrayList;
import java.util.List;
import java.util.*;



public class Arraylist {

	public static void main(String[] args) {
//		String[] a = new String[3];
//		a[0]="sai";
//		a[2]="Bharath";
//		a[1]="uha";
//		System.out.println(a);
		System.out.println("instilizing arraylist");
        ArrayList a1 = new ArrayList<>();
        a1.add(9.3);
		a1.add(10.2);
     	a1.add("sai");
		a1.add(3);
		System.out.println(a1);  
		
	List<Object> a2 = new ArrayList(10);
	//ArrayList<Object> a2 = new ArrayList<>(); both are same
      a2.add(9.3);
      a2.add(10.2);
    	a2.add("sai");
    	a2.add(3);
    	System.out.println(a2); 
    	System.out.println("instilizing arraylist a3");
    	ArrayList<Object> a3 = new ArrayList<>(20); 
    	
    	System.out.println(a3); 
    	
    	
    	List a4 = new ArrayList();
    	a4.add(4);
    	a4.add("sai");
    	System.out.println(a4);
    	a4.add(0,"dog");
    	System.out.println(a4);
    	a4.add(0,"ias");
    	System.out.println(a4);
    	a4.add("kl");
    	a4.add("uha");
    	a4.add("sai");
    	System.out.println(a4);
    	
    	//remove
    	System.out.println("remove11");
    	//a4.remove("sai");
    	System.out.println(a4.remove(0));
    	System.out.println(a4.remove(1));
    	
    	a4.remove(0);
    	System.out.println(a4);
    	//System.out.println("set");
    	//set
    	System.out.println("set");
    	a4.set(0,"bharath");
    	System.out.println(a4);
    	a4.set(1, "Priya");
    	System.out.println(a4);
    	//a4.set(18, "ramu");
    	System.out.println(a4);
    	
    	//isEmpty
    	
    	List b = new ArrayList();
    	System.out.println(b.isEmpty());
    	System.out.println(b.size());
    	
    	b.add("sai");
    	System.out.println(b.isEmpty());
    	System.out.println(b.size());
    	
    	//clear
    	
    	b.clear();
    	System.out.println(b);
    	
    	//contains
    	
    	System.out.println(a4.contains("uha"));
    	//System.out.println(a4);
    	
    	List<Integer> bb = new ArrayList();
    	bb.add(null);
    	System.out.println(b.isEmpty());
    	System.out.println("wrapperclass"+bb);
    	
    	System.out.println("Array to list and viceversa");
    	
    	//arraylist to array
    	List<Object> names = new ArrayList<>();
    	names.add("jonny");
    	names.add(9);
    	names.add("bharath");
    	System.out.println(names);
    	Object[] n = names.toArray();
    	for(int k=0;k<n.length;k++) {
    		System.out.println(n[k]);
    	}
    	
    	//System.out.println(namesarray[1]);
    	//array to arraylist
    	
    	String[] petarray = {"dog","pig","cat"};
    	//List al = Arrays.asList(petarray);
    	//converts array to rraylist
    	// we can change the value of the list but we cannot add or remove 
    	//from the array or list as the size is fixed
    	
    	System.out.println("sorting arraylist");
    	
    	List<String> a = new ArrayList();
    	a.add("2");
    	a.add("1");
    	a.add("10");
    	a.add("20");
    	a.add("672");a.add("52");
    	System.out.println(a);
    	Collections.sort(a);
    	System.out.println(a);
    	
    	
    	List<Object> aa = new ArrayList();
    	aa.add("sai");
    	aa.add(1);
    	aa.add(56);
    	aa.add(8);
    	aa.add("uha");
    	aa.add("abc");
    	System.out.println(aa);
    	//Collections.sort(aa); not applicable
    	System.out.println(aa);
    	
    	System.out.println("binarysearching");
    	
    	
    System.out.println("sorting arraylist");
    	//before the binarysearching we should do the sorting of the elements
    	List<String> ab = new ArrayList();
    	ab.add("2");
    	ab.add("1");
    	ab.add("10");
    	ab.add("20");
    	ab.add("672");ab.add("72");
    	System.out.println(ab);
    	Collections.sort(ab);
    	System.out.println(ab);
    	int im = Collections.binarySearch(ab,"10");
    	System.out.println(im);
    	// it will print the index of the searched number
    	
    	System.out.println("iterators");
    	
System.out.println("iterators");
    	
    	List<Object> a22 = new ArrayList();
    	a22.add("2");
    	a22.add("1");
    	a22.add("10");
    	a22.add("20");
    	a22.add("672");a22.add(52);
    	//System.out.println(a);
    	for(int i=0;i<a.size();i++)
    	{
    		System.out.print(" "+a22.get(i));
    		//a22.remove(2); index of boun
    	}
    	System.out.println();
    	
    	for(Object s:a22)
    	{
    		System.out.print(s+" ");
    		//a22.remove(2); index of boun
    	}
    	
    	System.out.println();
    	for(Iterator<Object> iterator = a22.iterator();iterator.hasNext();) {
    		Object k= iterator.next();
    	System.out.print(k+" ");
    		iterator.remove();
    	}
    	System.out.println();
    	System.out.println(a22+" ");
    	
    	System.out.println("new iterator");
    	List<Integer> ab1 = new ArrayList();
    	ab1.add(2);
    	ab1.add(3);
    	ab1.add(5);
    	ab1.add(7);
    	//Iterator<Integer> p = ab1.iterator();
    	for(Iterator<Integer> p = ab1.iterator(); p.hasNext();) {
    		System.out.println(p.next());
    		p.remove();
    	}
    	System.out.println(ab1);
//    	Iterator<Integer> p = ab1.iterator();
//    	p.next();
//    	p.remove();
//        System.out.println(ab1);
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
		
		
	
		
		
		
		

	}

}
