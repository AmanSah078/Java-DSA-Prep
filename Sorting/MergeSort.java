
import java.util.*;
class Sorting {
public static int[] m1(int[] arr1, int[] arr2)
{
	

//It is used to merge the arr into the result array	
int[] result=new int[arr1.length+arr2.length];
	int i=0;
	int j=0;
	int k=0;
	
	
//while(i < arr1.length && j < arr2.length) ke andar:
//- Agar if (arr1[i] < arr2[j]) true hai → i badhega, j wahi ka wahi rahega.
//- Agar condition false hai → j badhega, i wahi ka wahi rahega.
	
while(i<arr1.length && j<arr2.length)
{

	if(arr1[i]<arr2[j])
	{
		result[k]=arr1[i];
		i++;
		k++;
		
	}
	else {
		result[k]=arr2[j];
		j++;
		k++;
	}
}
	
//Copy Remaning Element of arr2
	
	while(i<arr1.length)
	{
		result[k]=arr1[i];
		i++;
		k++;
	}
	
//Copy Remaning Element of arr2
	while(j<arr2.length)
	{
		result[k]=arr2[j];
		j++;
		k++;
	}
	return result;
}
	public static void main(String[] args)
	{ 
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int n2= sc.nextInt();
		int[] arr2=new int[n2];
		for(int j=0; j<arr2.length; j++)
		{
			arr2[j]=sc.nextInt();
		}
		
//		int [] mergedsortarray=m1(arr1,arr2);
		int[] mergedsortarray = m1(arr1, arr2);
//Print the MergedSortArray Here		
System.out.println(Arrays.toString(mergedsortarray));
	}
}
