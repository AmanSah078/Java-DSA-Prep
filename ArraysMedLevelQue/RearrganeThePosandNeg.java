import java.util.*;
class RearrangeArrayElem {
	public static int[] m1(int[] arr)
	{
		int n=arr.length;
		int[] result=new int[n];
		
		int pos=0;
		int neg=1;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]>=0)
			{
		//u have to put into the new Array na dude		
				result[pos]=arr[i];
				pos=pos+2;
			}
			else {
			//u have to enter into the new Array na dude			
				result[neg]=arr[i];
				neg=neg+2;
			}
			
		}
		return result;
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
		int[]test=m1(arr);
		System.out.println(Arrays.toString(test));
	}
}
