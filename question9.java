//uniqueeliments
import java.util.Scanner;
public class question9
{
	
public static void main(String args[])
{
	int arr[]={9,2,1,4,5,2,1,9,3,4};
	
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
