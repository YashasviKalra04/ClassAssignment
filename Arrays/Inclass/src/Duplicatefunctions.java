import java.util.Scanner;
class Duplicatefunctions
{
	static void Array()
	{
		int number;
		Scanner x = new Scanner(System.in); 
		int arr[] = new int [5];
		System.out.println("Enter 5 numbers between 10 and 100(both inclusive): ");
		for (int i = 0; i < 5;)
		{
			number = x.nextInt();
			if (number < 10 ||number > 100)
				{
					System.out.println("Wrong Number entered.");
			        continue;
			    }    
			else
			    {
				    arr[i] =number;
			     	i++;
			    } 
			
		}	
		for (int j = 0; j < 5; j++)
		{
			for (int k = 0; k < j; )
			if (arr[k] == arr[j])
				{
					k++;
				}
			else 
			    {
				System.out.println(arr[k]);
				k++;
			    }	
        }

	}
	public static void main(String args[])
	{
		Array();
	}
}