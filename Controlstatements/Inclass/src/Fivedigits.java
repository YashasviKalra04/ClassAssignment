import java.util.Scanner;
class Fivedigits
{
	public static void main(String args[])
	{
		int number,a,b,c,d,e;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a five digit number: ");
		number = x.nextInt();
		{
			if(number<10000||number>99999)
		{
			System.out.println("The entered number is not a 5 digit number.");
			System.out.println("Enter a new number: ");
			number = x.nextInt();
		}
		else
            break;
		}
		a=number/10000;
        b=(number-a*10000)/1000;
        c=(number-a*10000-b*1000)/100;
        d=(number-a*10000-b*1000-c*100)/10;
        e=(number-a*10000-b*1000-c*100-d*10);
        System.out.println(+a+"   "+b+"   "+c+"   "+d+"   "+e);
	}
}