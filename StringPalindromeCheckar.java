package technoHacks_EduTech;

	import java.util.Scanner;

public class StringPalindromeCheckar
{

	public static void main(String[] args)
		{
			System.out.println("|||--Palindrome Checker--|||\n");
			Scanner input = new Scanner(System.in);
			
			boolean continueString = true;
			while(continueString)
			{
			System.out.println("--> Enter First Value");
			String str1 = input.next();
			
			Palindrome pol = new Palindrome();
			pol.ispalindrome(str1);
			

			System.out.println("");
			
			while(true)
			{
			System.out.println("-- If you want to check another, continue by pressing 'yes' or 'no' --");
			String userchoice = input.next().trim().toLowerCase();
			if(userchoice.equals("no"))
			{
				continueString = false;
				System.out.println("Closed...");
				break;
			}
			else if(userchoice.equals("yes"))
			{
				continueString = true;
				break;
			}
			else {
				System.out.println("--Please Enter yes Or no--");
			}
			
			}
			input.close();
			}
			
		}
}

	class Palindrome
	{
		public void ispalindrome(String str)
		{
			int left = 0;
			int right = str.length()-1;
			boolean inpalindrome = true;
			
			while(left < right)
			{
				if(str.charAt(left) != str.charAt(right))
				{
					inpalindrome = false;
					break;
				}
				left++;
				right--;
				
			}
			
			if(inpalindrome)
			{
				System.out.println("-->> It is a Palindrome...");
			}
			else {
				System.out.println("-->> It is Not a Palindrome...");
			}
					
		}
	}
