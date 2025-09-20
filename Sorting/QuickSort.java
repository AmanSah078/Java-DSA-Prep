//low=i
//High=j
import java.util.*;
class QuickSort {
    //To call by the Recursion
    public static void quicksort(int[] arr, int i, int j)
    {
        if(i >= j)
        {
            return;
        }

        int pi = m1(arr, i , j);
   
        quicksort(arr, i, pi - 1); //Left side
        //Then pivot se baad wala ko sort krna padega
        quicksort(arr, pi + 1, j); //Right side
    }

    //Partion Process
   public static int m1(int[] arr, int i, int j)
	{
	       int pivot = arr[j];
        int pIndex = i;
	   int k=i;
	   
        while(k<j)
		{
		if(arr[k]<=pivot)
		{
		swap(arr,k,pIndex);
		pIndex++;
			}
	k++;
			
		}
	   swap(arr, pIndex, j); // place pivot in correct position
        return pIndex; // return pivot index
   }	
		static void swap(int[] nums, int i, int j)
		{
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
		}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
