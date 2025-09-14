import java.util.*;
class DisplayArrayElement {
	public static void m1(int[] arr, int idx){
		//Base Case
	if(idx==arr.length)
	{
		return;
	}
	//Here first i should print the 0 index number then after we know very well 
//to use the method to perform the operation whatever u want	
     System.out.println(arr[idx]);
		m1(arr,idx+1);
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
		m1(arr,0);
	}
}

OUPUT
  /*5(Length OF Array)
10
20
30
40
50
  
10
20
30
40
50*/
  
