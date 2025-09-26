// [1, 2, 3, -2, 5]
// 9

import java.util.*;
class Kedan {
	public static void m1(int[] arr)
	{
		int currsum=0;
		int ovrsum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(currsum>=0)
			{
				
				currsum=currsum+arr[i];
			}
			else {
				currsum=arr[i];
			}
			if(currsum>ovrsum)
			{
				ovrsum=currsum;
			}
		}
	System.out.println(ovrsum);
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


