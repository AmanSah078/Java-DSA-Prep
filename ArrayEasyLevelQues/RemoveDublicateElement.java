import java.util.*;
class Trial {
	public static void m1(int[] arr)
	{
		//Firs u should comparing the Arrays
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1])
			{
				continue;
			}
			else {
				System.out.println(arr[i]);
			}
		}
		//To only print the Last Element
		int last=arr[arr.length-1];
		System.out.println(last);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
//Herre i am just sort the Array		
		Arrays.sort(arr);
		m1(arr);
	} 
}
