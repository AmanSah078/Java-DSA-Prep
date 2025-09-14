import java.util.*;
class Test {
	public static int m1(int[] arr, int idx)
	{
//Because we can only compare to the last index na 
		//we cannot to the compare to length of the Array		
		if(idx==arr.length-1)
		{
			return arr[idx];
		}
		int misa=m1(arr,idx+1);
		{
 //Bhai siddhi si baat if the misa is smaller than current then print misa 
//otherwise print current element     
			if(misa<arr[idx])
			{
				return misa;
			}
			else {
				return arr[idx];
			}
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
	int result=m1(arr,0);
		System.out.println(result);
	}
}
