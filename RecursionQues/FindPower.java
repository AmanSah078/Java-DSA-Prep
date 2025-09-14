import java.util.*;
class Test {
	public static int m1(int x, int n)
	{
		//Base case
		if(n==0)
		{
			return 1;
		}
 //The x n it means =Power of x is n   
int xn1=m1(x,n-1);
    
int xxn1=(x*xn1);
		return xxn1;

	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int x=sc.nextInt();
		int n=sc.nextInt();
		int result=m1(x,n);
		System.out.println("Power of x is " + result);
	}
}
