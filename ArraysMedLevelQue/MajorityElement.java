// [3, 3, 4, 2, 3, 3, 5, 3]
// Majority_Element should be=3

  import java.util.*;
class Majority {
	public static void m1(int[] arr)
	{
		int votes=1;
		int majority=arr[0];
		
		//Now lets start to apply the condition
		for(int i=1; i<arr.length; i++)
		{
		if(votes==0)
		{
			votes++;
			majority=arr[i];
		}
		else  if(majority==arr[i])
		{
			votes++;
		}
		else {
			votes--;
		}
	}
		System.out.println("Ur majority element is here :" +majority);
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
