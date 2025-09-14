import java.util.*;
class Test {
	public static void m1(int n)
	{
		//Base case
		if(n==0)
		{
			return;
		}
//First I(Because in our hand only n value na)   
System.out.println(n);

//Then  He(Means method dude becuase method is responsible to perform the ooperation na)  
		m1(n-1);

    
 //Then I   
		System.out.println(n);

	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		m1(n);
	}
}


