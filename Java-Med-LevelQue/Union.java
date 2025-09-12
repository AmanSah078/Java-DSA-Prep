import java.util.Arrays;
import java.util.*;
class Union {
	public static void m1(int[]arr1, int[] arr2,int [] merged)
	{
//		for(int i=0; i<arr1.length-1; i++)
//		{
//			if(arr1[i]==arr1[i+1])
//			{
//				continue;
//			}
//			else {
//				System.out.println(arr1[i]);
//			}
//		}
//		System.out.println(arr1[arr1.length-1]);
//		
//		for(int j=0; j<arr2.length-1; j++)
//		{
//			if(arr2[j]==arr2[j+1])
//			{
//				continue;
//			}
//			else {
//				System.out.println(arr2[j]);
//			}
//		}
//			System.out.println(arr2[arr2.length-1]);
//			
	//final
	//merged kr diya	

		for(int k=0; k<merged.length-1; k++)
		{
			if(merged[k]==merged[k+1])
			{
				continue;
			}
			else{
				System.out.println(merged[k]);
			}
		}
		System.out.println(merged[merged.length-1]);
		}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		for(int j=0; j<arr2.length; j++)
		{
			arr2[j]=sc.nextInt();
		}
		Arrays.sort(arr2);
		int[]merged=new int[arr1.length+arr2.length];
		 int idx = 0;
        for (int x : arr1) merged[idx++] = x;  //Both r use to copy the arr1 and arr2 into the merged array
        for (int x : arr2) merged[idx++] = x;

		Arrays.sort(merged);
		m1(arr1,arr2,merged);
		
	}
}
