import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
	public static void main(String args[])
	{
	int a,b,c;
	double d,r1,r2;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the values of a,b and c: ");
    System.out.println("Enter the value of a: ");
    a=s.nextInt();
    System.out.println("Enter the value of b: ");
    b=s.nextInt();
    System.out.println("Enter the value of c: ");
    c=s.nextInt();
    System.out.println("The quadratic equation is ax^2+bx+c");
    d=b*b-4*a*c;
    if(d>=0)
    {
    System.out.println("The roots are real and unequal");
    r1=(-b+(Math.sqrt(d)))/(2*a);
    r2=(-b-(Math.sqrt(d)))/(2*a);
    System.out.println("root 1="+r1 +"root 2="+r2);
    }
    else
    {
    System.out.println("Both the roots are complex");
    }
	}
}