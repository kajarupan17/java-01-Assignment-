
 //twodarray
 class question10
{
	public static void main(String args[])

	{
		String [][] a={{"Name ","Age","Address"},{"kajan","25","JAFFNA"},{"kugan","50","colombo"},{"KAPIL","25","JAFFNA"}};
		print2darray(a);
	}

	public static void print2darray(String[][] arr)
	{
		System.out.println("##########################################################");
		for(int row=0; row<arr.length; row++)
		{
			for(int column = 0; column < arr[row].length; column++) 
			{
				System.out.print("| \t" + arr[row][column] + " \t ");
			}
			System.out.print("|");
			System.out.println();
			if(row == 0) {
				System.out.println("##########################################################");
			}
		}		
		System.out.println("##########################################################");
	}
}