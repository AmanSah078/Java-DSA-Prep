import java.util.*;
class DecrNum {
	public static void m1(int n)
	{
		//Base Case
		if(n==0)
		{
			return;
		}
 //First I should Perform The operation   
		System.out.println(n);
 //Then u Dude   
		m1(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		m1(n);
	}
}
