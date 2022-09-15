public class arrayPicker 
{
	public static void main(String args[])
	{
		//create array of 100 numbers
		int[] randomNums = new int[100];
		boolean flag = true;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		//populating array with values
		for (int i = 0; i < 100; i++)
		{
			//using Math.random to get double values, multiplying by 100 means rather than a double value from 0-1 (1 not inclusive), 
			//it will be 0-100 (100 still not inclusive), and adding 1 changes possible values to 1-100 (100 now inclusive)
			//also, since Math.random returns a double, have to cast to an int to fit within array
			randomNums[i] = (int) (Math.random() * 100 + 1);
		}
		
		System.out.println("Enter an index to see the number at that point");
		//while loop allows user to try inputing numbers until one works
		while (flag) 
		{
			try
			{
				//attempt to print value at index given by user
				System.out.println(randomNums[scan.nextInt()]);
				//setting flag to false after successful attempt, flag is set to false to break loop
				flag = false;
			} catch (ArrayIndexOutOfBoundsException ae)
			{
				//values not 0-99 will cause out of bounds error, printing error message to warn user
				System.out.println("Out of Bounds");
			} catch (Exception e)
			{
				//catches any other error, resets Scanner and moves to next iteration of loop
				scan.next();
				System.out.println("Error, please try again");
			}
		}
	}
}
