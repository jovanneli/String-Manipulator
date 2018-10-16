
public class StringManipulator 
{
	public String noVowels (String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			char letter = str.charAt(i);
			if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' || 
				letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u')
			{
				return "*";
			}
			else 
			{
				String emptyString = " ";
				emptyString += letter;
				return letter;
			}
		}
	}
	
	public String reverse (String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			return str.substring(str.length()-1);
		}
	}
}
