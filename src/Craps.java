import java.util.Scanner;
/**
 * 
 * @author jovanne li
 *
 */

public class Craps
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Dice die1 = new Dice();
		Dice die2 = new Dice();
			
		boolean game = true;
		while (game)
		{
			System.out.println("Welcome to Craps! Press enter to roll the dice."); 
			in.nextLine(); 
		
		boolean play = true;
		while (play)
		{
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			int sum = roll1 + roll2;
			System.out.println("You rolled " + sum);
			
			if (sum == 7 || sum ==11)
			{
				System.out.println("You win!");
				play=false;
			}
			else if (sum == 2 || sum == 12)
			{
				System.out.println("You lose. :(");
				play=false;
			}
			else
			{
				int point = sum;
				System.out.println(point + " is your point. Press enter to roll the dice."); in.nextLine();
				
				boolean continuePlay = true;
				while (continuePlay)
				{
					roll1 = die1.roll();
					roll2 = die2.roll();
					sum = roll1 + roll2;
				
					if (sum == point)
					{
						System.out.println("You rolled " + sum);
						System.out.println("You win!");
						continuePlay = false;
						play = false;
					}
					else if (sum == 7)
					{
						System.out.println("You rolled " + sum);
						System.out.println("You lose. :(");
						continuePlay = false;
						play = false;
					}
					else
					{
						System.out.println("You rolled " + sum);
						System.out.println("Press enter to roll the dice."); in.nextLine();
					}
				}
			}
		}
		
			System.out.println("Would you like to play again? (enter yes or no)"); 
								String yesNo = in.nextLine();
			
			boolean loop = true;
			while (loop)
			{
				if (yesNo.equals("yes"))
				{
					loop=false;
				}
				else if (yesNo.equals("no"))
				{
					loop=false;
					game=false;
					System.out.println("Thanks for playing!");
				}
				else
				{
					System.out.println("Sorry, that is an invalid input. Try again: "); yesNo = in.nextLine();
				}
			}
		}
	}
}
