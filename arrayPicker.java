public class arrayPicker 
{
	public static void main(String args[])
	{
		int[] randomNums = new int[100];
		boolean flag = true;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		for (int i = 0; i < 100; i++)
		{
			randomNums[i] = (int) (Math.random() * 100 + 1);
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
	}
}
