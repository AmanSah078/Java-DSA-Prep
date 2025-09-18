import java.util.*;
class PartioningArray {
	public static int[] m1(int[] arr, int pivot)
	{
		int n=arr.length;
//		int[] result=new int[n]; Because not need to store the value in the new Array
		int i=0;
		int j=0;
		while(i<n)
		{
			if(arr[i]>pivot)
			{
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return arr;
		
	}
		static void swap(int[] nums, int i, int j)
		{
			int temp=nums[i];
		     nums[i]=nums[j];
			nums[j]=temp;
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
		int pivot=sc.nextInt();
		int[] test=m1(arr,pivot);
		System.out.println(Arrays.toString(test));
	}
}
