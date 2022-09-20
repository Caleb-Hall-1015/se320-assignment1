import java.util.*;

public class displaySum 
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int userInput1, userInput2, sum;
		boolean inputFlag = true;
		
		while (inputFlag)
		{
			try
			{
				System.out.println("Please enter the first int");
				userInput1 = scan.nextInt();
				System.out.println("Please enter the second int");
				userInput2 = scan.nextInt();
				sum = userInput1 + userInput2;
				System.out.format("The addition of %d and %d yields: %d", userInput1, userInput2, sum);
				inputFlag = false;
			} catch (Exception e)
			{
				scan.next();
				System.out.println("Invalid input, please only use ints\n");
			}
		}
		scan.close();
	}
}
