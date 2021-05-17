
public class Arrays2D {

	public static void main(String[] args) {
		for(int hours=1;hours<=24;hours++)
		{
			for(int minutes=1;minutes<=60;minutes++)
			{
				System.out.println(hours+":"+minutes);
			}
			System.out.println();
		}
		
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]%2==0)
				{
					continue;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int[] random = {6,-4,12,0,-10};
		int x=12;
		int y = Arrays.binarySearch(random,x);
		System.out.println(y);

	}

}
