import java.util.*;
class MoveZeroToEnd{
	public static void movezerotoend(int[] arr)
	{
//	    int count=0;
		int start=0;
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]!=0)
		{
			arr[start]=arr[i];
			start++;
		}

	}
	//To place the zero at the End
		while(start<arr.length)
		{
			arr[start]=0;
			start++;
		}
		for(int j=0; j<arr.length; j++)
		{
			System.out.print(arr[j]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
//		Arrays.sort(arr);
		movezerotoend(arr);
	}
} 
