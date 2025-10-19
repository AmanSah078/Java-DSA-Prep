class MovetoEnd {
  public static void movezerotoend(int[]arr)
  {
    int j=0;
    for(int i=0; i<arr.length; i++)
      {
        if(arr[i]!=0)
        {
          arr[j]=arr[i];
          j++;
        }
      }
    
    while(j<arr.length)
      {
        arr[j]=0;
        j++;
      }
    	for(int k=0; k<arr.length; k++)
	{
		System.out.println(arr[k]);
	}

  }
  public static void main(String[] args)
  {
    int[] arr={0,1,0,3,12};
     MovetoEnd. movezerotoend(arr);
}
