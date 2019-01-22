import java.util.Scanner;
import java.lang.Math;

class Series
{
    public static ssint factorial(int n)
    {
        int fac= 1;
        int i;

        for(i = n; i>0; i--)
        {
            fac = fac*i;
        }
        return fac;
    }

    public static void main(String args[])
    {
        int a, b, c;
        Scanner scanning = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = scanning.nextInt();

        System.out.print("Enter the value of b: ");
        b = scanning.nextInt();

        float sum = 0;

        for(c=0; c<b; c++)
        {
            sum += (float)(( Math.pow(a, c)) / factorial(c));
        }
        
        System.out.println("The sum of series is : " +sum);
    }
}