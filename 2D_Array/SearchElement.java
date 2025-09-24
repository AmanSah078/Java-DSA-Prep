import java.util.*;
class Search {
	public static boolean search(int matrix[][], int key)
	{
		int n=matrix.length;
		int m=matrix[0].length;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(matrix[i][j]==key)
				{
					System.out.println("key found at " + i + " , " + j);
					return true;
				}
			}
		}
		System.out.println("Sorry Key is not found");
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int matrix[][]=new int[3][3];
		int n=matrix.length;
		int m=matrix[0].length;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}

		
	search(matrix,9);
	}
}

