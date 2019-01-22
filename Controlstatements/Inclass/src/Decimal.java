import java.util.*;

class Decimal
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = x.nextDouble();
        System.out.print("\nEnter 2nd number : ");
        double b = x.nextDouble();
       a = a*1000;
       b = b*1000;
        if(a==b)
        {  
          System.out.println("The two numbers ARE equal upto 3 decimal places");
        }
        else
        {
          System.out.println("The two numbers ARE NOT equal upto 3 decimal places");
        }
    }
}