
public class Sumofarray {

	public static void main(String[] args) {
		int a[] = {2,8,9,7,3,9};
		int sum=0;
		int k = a.length;
		for(int i=0;i<k;i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println("the sum of array is " +sum);
		

	}

}
