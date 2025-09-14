import java.util.*;
class Test {
	public static void m1(int[] arr, int idx){
		//Base Case
if(idx<0)
   {
	   return;
   }
System.out.println(arr[idx]);
	m1(arr,idx-1);
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
 //Define the Idx who is that   
		int idx=arr.length;
		m1(arr,idx-1);
	}
}
