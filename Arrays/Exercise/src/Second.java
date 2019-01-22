import java.util.Scanner;

class Second

{

	public static void main(String args[])

	{

		int b;

		int sum=0;

		Scanner x = new Scanner(System.in); 

		int a[] = new int [5];

		System.out.println("Enter the 5 elements of array");

		for ( int i = 0; i < 5;i++)

		{

			a[i] = x.nextInt();

		}	

		for (int i = 0; i < 5; i++)

		{

			System.out.println(j + "th element of the array is" + a[j]);

		}
		for (int i = 0; i < 5; i++)

		{
         	sum = sum + a[i];

         }	

		System.out.println("The sum of the elements is " + sum);

    
    large=a[0];
        small=a[0];
       for (int i = 0; i < 5; i++)
       {


       	if(a[i]>large)
                {
	              large=a[i];
                }
         if(a[i]<small)
         {
         	small=a[i];
         }

       }

System.out.println("the largest no. is"+large "and smallest number is" +small);

     int count=0;

                for(int i=0; i<5; i++)

                {

                    if(x[i]%2==0)

                        count++;

                }



                System.out.println(" Total even numbers are : " + count);

             System.out.println(" Enter the number you want to check : ");

                int n = x.nextInt();

                count = 0;

                for(int i=0; i<5; i++)

                {

                    if(x[i]==n)

                        count++;

                }

                if(count==0)

                    System.out.println(" The entered number is not in array ");

                else

                    System.out.println(" The entered number is occurring : " + count + " times. ");

                 


	}

}