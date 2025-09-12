import java.util.*;
class MajOrity {
	public static int FindMajorityElme(int[] arr)
	{
		int majority=arr[0];
		int votes=1;
		
		for(int i=1; i<arr.length; i++)
			
		{
			if(votes==0)
			{
				votes++;
				majority=arr[i];
			}
			else if(majority==arr[i])
			{
				votes++;
			}
			else {
				votes--;
			}
		}
		return majority;
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
		int result=FindMajorityElme(arr);
		
System.out.println("The majoriyt element is  " + result);
	}
}
