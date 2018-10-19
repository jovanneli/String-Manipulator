
public class StringManipulator 
{
	public String noVowels (String str)
	{
		String someString = "";
		for(int i = 0; i < str.length(); i++)
		{
			char letter = str.charAt(i);
			if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' || 
				letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u')
			{
				someString += "*";
			}
			else 
			{
				someString += letter;
			}
		}
		return someString;
	}
	
	public String reverse (String str)
	{
		String someString = "";
		for (int i = str.length()-1; i >= 0; i--)
		{
			char letter = str.charAt(i);
			someString += letter;
		}
		return someString;
	}
}
