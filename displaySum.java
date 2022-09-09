import java.util.*;

public class displaySum 
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int val1;
		int val2;
		int val3;
		boolean inputFlag = true;
		
		while (inputFlag)
		{
			try
			{
				System.out.println("Please enter the first int");
				val1 = scan.nextInt();
				System.out.println("Please enter the second int");
				val2 = scan.nextInt();
				val3 = val1 + val2;
				System.out.format("The addition of %d and %d yields: %d", val1, val2, val3);
				inputFlag = false;
			} catch (Exception e)
			{
				scan.next();
				System.out.println("Invalid input, please only use ints\n\na");
			}
		}
		
		scan.close();
	}
}
