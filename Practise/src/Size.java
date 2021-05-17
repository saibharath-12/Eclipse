
public class Size {

	public static void main(String[] args) {
		int[] a = {10,20,89,22};
		int[] b = {9,4,5,3,5,6,3,4};
		a=b;
		for(int x:a)
		{
			System.out.println(x);
		}
		System.out.println(a.length);
		
		int[] c = new int[6];
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}


	}

}
