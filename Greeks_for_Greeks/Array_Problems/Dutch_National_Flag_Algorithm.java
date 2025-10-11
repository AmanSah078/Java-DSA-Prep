import java.util.*;
class Dutch_National_Flag_Algorithm {
	static void switchingProcess(int[] arr)
	{
		int start=0;
		int mid=0; //It check the current loop
		int end=arr.length-1;
		while(mid<=end)
		{
			switch(arr[mid])
			{
				case 0:
				swap(arr,start,mid);
				
					start++;
					mid++;
					break;
				
				case 1:
				mid++;
				break;
				
				case 2:
				swap(arr,mid,end);
		
					end--;
					break;

			}
		}
	}

	
//One more Fuction for the swapping
	static void swap(int[]arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args)
	{
		int[] arr= {0,1,2,0,1,2};

		switchingProcess(arr);;
	System.out.println(Arrays.toString(arr));
	}
}
