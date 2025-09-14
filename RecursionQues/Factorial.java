import java.util.*;
class Test {
	public static int m1(int n)
	{
		//Base
		if(n==1)
		{
			return 1;
		}
		
		int fact=m1(n-1);
		int factr=n*fact;
return factr;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int result=m1(n);
		System.out.println("Hey factorial will become " + result);
	}
}
