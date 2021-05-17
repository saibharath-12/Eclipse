
public class Evenoddinarray {

	public static void main(String[] args) {
		int a[] = {3,6,4,8,5,67,90};
		int k = a.length;
		System.out.println("even number in array ");
		for(int i =0;i<k;i++)
		{
			if(a[i]%2==0)
				System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("odd numbers in an array ");
		for(int i =0;i<k;i++)
		{
			if(a[i]%2!=0)
				System.out.print(" "+a[i]);
		}
	}

}
