import java.util.*;
//Palindromeq
class question4
	{

		public static void main(String args[])
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the name: ");
			String name = scanner.nextLine();

			char[] nameArray = name.toCharArray();
			boolean identifyer =true;

			int j = nameArray.length - 1;

			for(int i=0;i<nameArray.length;i++) 
		{
			if(nameArray[i] != nameArray[j])
				{
					identifyer = false;
				}
			j--;
		}

			if(identifyer == true)
			{
				System.out.println("This is palindrome word");
			}
				else
				{
					System.out.println("This is not palindrome word");
				}
			}
	}