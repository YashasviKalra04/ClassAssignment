import java.util.Scanner;
class Rhombus

{
    public static void main(String args[])
    {   
        int y,c,c2,i;
        char ch;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        y = x.nextInt();
        c = 1;
        c2 = 1;
        ch = 'A';

        for (i = 1; i < (y * 2); i++) 
        {
            for (int a = y - c2; a > 0; a--) 
            {
                System.out.print("\t");
            }
            if (i < y) 
            {
                c2++;
            } 
            else 
            {
                c2--;
            }
            for (int j = 0; j < c; j++) 
            {
                System.out.print(ch);
                if (j < c / 2) 
                {
                    ch++;
                } else 
                {
                    ch--;
                }
            }
            if (i < y)
            {
                c = c + 2;
            } 
            else
            {
                c = c - 2;
            }
            ch = 'A';

            System.out.println();
        }
    }
} 