import java.util.Scanner;
class Index
{
	public static void main(String args[])
	{
		int number;
		Scanner x = new Scanner(System.in); 
		int arr[] = new int [10];
		System.out.println("Enter the number of elements of array: ");
		number = x.nextInt();
		System.out.println("Enter the elements of array: ");
		for ( int i = 0; i < number;i++)
		{
			arr[i] = x.nextInt();
		}	
		for (int j = 0; j < number; j++)
		{
			System.out.println(j + "th element of the array is" + arr[j]);
		}

	}
}