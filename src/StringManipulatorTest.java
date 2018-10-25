import java.util.Scanner;

public class StringManipulatorTest 
{
	
	public static void main (String[] args)
	{	
		StringManipulator stringManipulator = new StringManipulator();
		Scanner in = new Scanner(System.in);
		boolean manipulator = true;
		while (manipulator)
		{
			System.out.println("Indicate which method you would like to run by "
								+ "entering 1 for the noVowels method and 2 for the reverse method: "); 
								int method = in.nextInt(); in.nextLine();
							
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

		System.out.println("Would you like to try again? (enter yes or no) "); 
							String yesOrNo = in.nextLine();
		
		boolean tryAgain = true;
		while (tryAgain)
		{
			if (yesOrNo.equals("yes"))
			{
				tryAgain = false;
			}
			else if (yesOrNo.equals("no"))
			{
				tryAgain = false;
				manipulator = false;
				System.out.println("Thanks for playing!");
			}
			else
			{
				System.out.print("Sorry, that is an invalid input. Try again: "); yesOrNo = in.nextLine();
			}
		}
		}
	}
}
