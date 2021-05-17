import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int org_int= num;
		int rev =0;
		while(num!=0)
		{
			int r = num%10;
			rev = rev*10+r;
			num = num/10;
			
		}
		if(org_int == rev)
		{
			System.out.println(rev+ "pallindromae");
			
		}
		else
		{
			System.out.println(rev+ "not a pallindrome");
		}
		

	}

}
