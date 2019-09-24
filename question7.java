import java.util.*;
//SwapArrayEliment
class question7
	{

		public static void main(String args[])
		{
	
			printStament(1,4);

		}
	
		public static void printStament( int indexa, int indexb) 
			{
		
				int[] arr = {9,3,6,1,5,2,2};
		
				System.out.print("Before Swap: ");
		
				for(int i = 0; i<arr.length; i++) {
				System.out.print(" " + arr[i]);
			}
		
		System.out.println();
		
			int temp = arr[indexa];
			arr[indexa] = arr[indexb];
			arr[indexb] = temp;
		
			System.out.print("After Swap: ");
		
			for(int i = 0; i<arr.length; i++)
			{
				System.out.print(" " + arr[i]);
			}
		
		
			}

	}


