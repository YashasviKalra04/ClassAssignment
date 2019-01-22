import java.util.Scanner;
class Vowel
{
    public static void main(String args[ ])
    {
    int i=0;
    char ch;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a character : ");
    ch=input.next().charAt(0);    
    switch(ch)
    {
     case 'A'  :
     case 'E'  :
     case 'I'  :
     case 'O'  :
     case 'U'  :
     case 'a'  :
     case 'e'  :
     case 'i'  :
     case 'o'  :
     case 'u'  :
     i++;
    }
    if(i==1)
    {
    System.out.println("Entered character "+ch+" is a Vowel");
    }
    else
    { 
    if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
    {System.out.println("character entered "+ch+"is consonant");}        
    else
    {System.out.println("Not an alphabet");}
    }      
    }
} 