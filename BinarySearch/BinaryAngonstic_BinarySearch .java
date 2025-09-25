import java.util.*;
class BinaryAngonstic_BinarySearch {
	public static int binaryAngonstic(int[] arr, int target)
	{
	int start=0;
		int end=arr.length-1;
//Check whether the array is sorted in ascending or descending order
		//don't think about the Array is in the Ascending or Descending order
		boolean isasc=arr[start]<arr[end];
		
			while(start<=end)
		{
//We should find the mid
			int mid=start+(end-start)/2;    //Basically it is good for  the large number
if(arr[mid]==target)
{
	return mid;
}
				if(isasc)
				{
					
			if(target<arr[mid])
			{
				end=mid-1;
	
			}else {
						start=mid+1;
					}
				}
				
				else {
			if(target>arr[mid]){
		
						end=mid-1;
					}
					else {
						start=mid+1;
					}
				}
	//it means when target==mid then at that time need to return the mid na		
		
	}
		return -1;
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
		int target=sc.nextInt();
		int result=binaryAngonstic(arr,target);
		System.out.println(result);
	}
}
		
