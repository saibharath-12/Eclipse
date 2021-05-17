import java.util.*;
public class Exceptions {

	public static void main(String[] args) {
		int i=10;
		int j;
		int k=0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		j= sc.nextInt();
		//21
		System.out.println("enter a number");
		
		try {
			k=i/j;
		}
		
		catch(Exception e){
			System.out.println("we cannot divde witho zero");
		}
		finally {
			System.out.println("sai");
		}
		System.out.println(k);

	}

}
