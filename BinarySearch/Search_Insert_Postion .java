// Input: arr[] = [1, 3, 5, 6], k = 5
// Output: 2
// Explanation: Since 5 is found at index 2 as arr[2] = 5, the output is 2.

//   Input: arr[] = [1, 3, 5, 6], k = 2
// Output: 1
// Explanation: The element 2 is not present in the array, but inserting it at index 1 will maintain the sorted order.

// Input: arr[] = [2, 6, 7, 10, 14], k = 15
// Output: 5
// Explanation: The element 15 is not present in the array, but inserting it after index 4 will maintain the sorted order.
  
class Search_Insert_Postion {
	public static int ans(int[] arr, int k)
	{
	int start=0; 
		int end=arr.length-1;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(k>arr[mid])
		{
			start=mid+1;
		}
		else if(k<arr[mid])
		{
			end=mid-1;
		}
		else {
			return mid;
		}
	}
		return start;
	}
	public static void main(String[] args)
	{

	int[] arr={2,6,7,10,14};
		int k=15;
	
		int result=ans(arr,k);
		System.out.println(result);
	}
	
}




