import java.util.Scanner;

class Pascals
{
	public static void main(String args[])
	{

		Scanner x= new Scanner(System.in);
		int number, rows, i, j, k;
		number=1;

		System.out.print("Enter the numberber of rows upto which you want the Pascal's Triangle to be printed: ");
		rows= x.nextInt();

		for(i=0; i<rows; i++)
		{
			for (j=rows; j>i; j--)
			{
				System.out.print(" ");
			}
			number=1;
			for (k=0; k<=i; k++)
			{
				System.out.print(number+ " ");
				number= number*(i-k)/(k+1);
			}
			System.out.println();
		}

	}
}