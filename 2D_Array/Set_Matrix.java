import java.util.*;
class Set_Matrix {
	public static void setmatrix(int matrix[][])
	{
	int n=matrix.length;
		int m=matrix[0].length;
		//marker
		boolean row[]=new boolean[n];
		boolean col[]=new boolean[m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
		//only to indicate which row and column has Zero		
				if(matrix[i][j]==0)
				{
//					matrix[i][j]=0;
					row[i]=true;
					col[j]=true;
				}
				
			}
		}
		//To print the all the row and column which is contain the zero
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(row[i] || col[j])
				{
					matrix[i][j]=0;
				}
			}
		}
      //Now to Print the updated matrix
		  for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		int matrix[][]=new int[2][2];
		int n=matrix.length;
		int m=matrix[0].length;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}

		setmatrix(matrix);
	}
}
