import java.util.Scanner;

public class StringManipulatorTest 
{
	
	public static void main (String[] args)
	{	
		StringManipulator stringManipulator = new StringManipulator();
		Scanner in = new Scanner(System.in);
		System.out.println("Indicate which method you would like to run by "
							+ "entering 1 for the noVowels method and 2 for the reverse method: "); 
							int method = in.nextInt();
							in.nextLine();
		boolean play = true;
		while (play)
		{
			if (method == 1)
			{
				System.out.println("Please enter a word or phrase: "); String randomString = in.nextLine();
				System.out.println("Manipulated string: " + stringManipulator.noVowels(randomString));
				play = false;
			}
			else if (method == 2)
			{
				System.out.println("Please enter a word or phrase: ");; String randomString2 = in.nextLine(); 
				System.out.println("Manipulated string: " + stringManipulator.reverse(randomString2));
				play = false;
			}
			else
			{
				System.out.print("Not an acceptable number. Try again: "); method = in.nextInt(); in.nextLine();
			}
		}

		System.out.println("Would you like to try again? Press 3 for yes and 4  for no: "); 
							int yesOrNo = in.nextInt(); in.nextLine();
		
		boolean tryAgain = true;
		while (tryAgain)
		{
			if (yesOrNo == 3)
			{
				System.out.println("Indicate which method you would like to run by "
					+ "entering 1 for the noVowels method and 2 for the reverse method: "); 
					method = in.nextInt();
					in.nextLine();
				if (method == 1)
				{
					System.out.println("Please enter a word or phrase: "); String randomString = in.nextLine();
					System.out.println("Manipulated string: " + stringManipulator.noVowels(randomString));
				}
				else if (method == 2)
				{
					System.out.println("Please enter a word or phrase: ");; String randomString2 = in.nextLine(); 
					System.out.println("Manipulated string: " + stringManipulator.reverse(randomString2));
				}
				
				System.out.println("Would you like to try again? Press 3 for yes and 4  for no: "); 
									yesOrNo = in.nextInt(); in.nextLine();
			}
			else if (yesOrNo == 4)
			{
					tryAgain = false;
					System.out.println("Thanks for playing!");
			}
			else
			{
				System.out.print("Not an acceptable number. Try again: "); yesOrNo = in.nextInt(); in.nextLine();
			}
		}
	}
}
