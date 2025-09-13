import java.util.*;
class Palindrome {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int original=n;
		while(n!=0)
		{
			int digits=n%10;
		 rev=rev*10+digits;
			n=n/10;

		}
			if(rev==original)
			{
				System.out.println("it is palindrome number");
			}
			else {
				System.out.println("Not Palindrome");
			}
		}
	}

