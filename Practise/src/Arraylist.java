import java.util.*;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		arr.add(11);
		arr.add(12);
		System.out.println(arr);
		Iterator it = arr.iterator();
		
		while(it.hasNext())
		{
			int i = (int) it.next();
			if(i == 6) {
				it.remove();
			}
			else {
				System.out.println(i);
				
			}
		}
		System.out.println(arr);

	}

}
