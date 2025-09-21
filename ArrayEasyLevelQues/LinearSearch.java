import java.util.*;
class LinearSearch {
	public static void linearsearch(int[] arr, int search)
	{
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
		if(arr[i]==search)
		{
			index=i;
		}	
	}
		if(index==-1)
		{
			System.out.println("Sorry Element is not Avaialbe");
		}
		else {
			System.out.println("Yes Element is Avaialbe at index " + index);
		}
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
		int search=sc.nextInt();
		linearsearch(arr,search);
	}
}
