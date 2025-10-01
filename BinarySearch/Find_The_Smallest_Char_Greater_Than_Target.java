//Meaning of this Quesitions is similar to the Celling Element-0->>It means if the target char should be greater than/..

class CharPosition {
	public static char firstindex(char[] letters, char target)
	{
		int start=0;
		int end=letters.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target < letters[mid])
			{
			end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return letters[start%letters.length];
	}
	public static void main(String[] args){
char[] letters={'c','f','j'};
		char target='d';
		char result=firstindex(letters,target);
		System.out.println(result);
	}
}

// HEY!-OUPUT-f
