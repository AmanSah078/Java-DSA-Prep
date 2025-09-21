import java.util.*;
class Trail {
	public static void m1(int[] arr)
		
	{
		//1st Max
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
	
		//2nd Min	
		int secondlargest=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<secondlargest)
			{
			secondlargest=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<max && arr[i]>secondlargest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.println(secondlargest);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		m1(arr);
	}
}
