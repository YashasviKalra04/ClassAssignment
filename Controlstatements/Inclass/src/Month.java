import java.util.*;
import java.lang.Math;

class Month
{

public static void main(String args[])
{
   int y,x;
   x=0;
   Scanner a= new Scanner(System.in);
   do
 {
 	System.out.println("Enter a number between 1 to 12");
   y=a.nextInt();

   if((y>=1) && (y<=12))
   {
   switch(y)
   {
   	case 1:
   	System.out.println("The month is January");
   	break;
   	case 2:
   	System.out.println("The month is February");
   	break;
   	case 3:
   	System.out.println("The month is March");
   	break;
   	case 4:
   	System.out.println("The month is April");
   	break;
   	case 5:
   	System.out.println("The month is May");
   	break;
   	case 6:
   	System.out.println("The month is June");
   	break;
   	case 7:
   	System.out.println("The month is July");
   	break;
   	case 8:
   	System.out.println("The month is August");
   	break;
   	case 9:
   	System.out.println("The month is September");
   	break;
   	case 10:
   	System.out.println("The month is October");
   	break;
   	case 11:
   	System.out.println("The month is November");
   	break;
   	case 12:
   	System.out.println("The month is December");
   	break;
   }
}


else
{
	System.out.println("The number is incorrect");
}
Scanner enter= new Scanner(System.in);
System.out.println("do you want to continue? 1.Yes 2.No?");
 x=enter.nextInt();

}
while(x==1);
}
}