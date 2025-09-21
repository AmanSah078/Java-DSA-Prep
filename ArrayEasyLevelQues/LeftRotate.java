import java.util.*;
class LeftRotate {
	public static void leftrotater(int[] arr)
	{
		int first=arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
	//I am just doing here shifting		
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		//To the Print the Array
System.out.println("ur leftRotate is Here");		
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
		}
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
		leftrotater(arr);
	} 
} 
