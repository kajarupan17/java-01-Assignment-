import java.util.Scanner;
//occurrencesortedarray
public class question3

{
	
public static void main(String args[])
{
	int arr[]={1,1,1,1,2,2,2,3,3,6,6,8,8,8,8};
	
	int count=0;
	
	for(int i=0;i<arr.length;i++) 
	{
		
		int j;
		
		for(j=0;j<arr.length;j++) 
		{
			if(arr[i] == arr[j])
				{
				break;
				}
		}
		if(i == j) 
		{
			
			//System.out.println(arr[i]);
			
			for(int m=0; m<arr.length; m++) 
			{
				if(arr[i] == arr[m])
					{
					count = count + 1;
					}
			}
			
			System.out.println("Number "+ arr[i] + "->" + count);
			count = 0;
		}
	}
}
}