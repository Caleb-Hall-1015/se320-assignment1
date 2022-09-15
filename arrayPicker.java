public class arrayPicker 
{
	public static void main(String args[])
	{
		int[] randomNums = new int[100]; //100 values in the array
		boolean flag = true;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		for (int i = 0; i < 100; i++)
		{
			randomNums[i] = (int) (Math.random() * 100 + 1); //multiplying by 100 to get many different values to put into array,
			                                                 //then adding 1 to shift results from 0-99 to 1-100
		}
		
		System.out.println("Enter an index to see the number at that point");
		while (flag) 
		{
			try
			{
				System.out.println(randomNums[scan.nextInt()]);
				flag = false;
			} catch (ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("Out of Bounds");
			} catch (Exception e)
			{
				scan.next();
				System.out.println("Error, please try again");
			}
		}
		
		scan.close();
	}
}
