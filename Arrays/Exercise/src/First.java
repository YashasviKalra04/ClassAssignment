import java.util.Scanner;

class First

{

	public static void main(String args[])

	{

		int l,m,n;

		Scanner x = new Scanner(System.in); 

		int a[][] = new int [20][2];

		for (int z=1; z==1;)

		{

		System.out.println("Enter the number of two digit numbers(max 20)");

		n= x.nextInt();

		  if (n>20)

		  	{

		  		System.out.println("Reenter your choice. Wrong number entered");

		    	continue;

		  	}	

		  else

		    {

		    	l=n;

		  		z++;

		    }



		}

			

		System.out.println("Enter the two digit numbers one digit at a time");

		for ( int i = 0; i < n;i++)

		{

			for (int j = 0; j < 2;)

			{

		     m= x.nextInt();

		     if (m<0||m>10)

		        {

		       		System.out.println("Error: ");

		       		System.out.println("Re-enter the digit");

		       		continue;

		        }

		     else

		     	{

		     		a[i][j]=m;

		            j++;

		        }    

			}

			System.out.println(i + "th number entered");

		}	

		for (int c = 0; c < l; c++)

		{

			if (a[c][2]%2==0)

				System.out.println(a[c][1] + (a[c][2]*2));

			else

				continue;

		}



	}

}