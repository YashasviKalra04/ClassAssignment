import java.util.Scanner;
class Stack
{
	int a[]=new int[10];
    int top;
    void Push(int num)
    {
    	if(isFull())
    	{
    		System.out.println("The number cannot be entered.");
    	}
    	else
    	{
    		top++;
    		a[top]=num;
    		System.out.println("The number is inserted");
    	}
    }
    void Pop()
    {
    	if(isEmpty())
    	{
    		System.out.println("The stack is empty");
    	}
    	else
    	{
    		System.out.println(a[top]);
    		top--;
    		System.out.println("Element deleted.");
    	}
    }
    boolean isEmpty()
    {
    	if(top==-1)
    		return true;
    	else
    		return false;
    }
    boolean isFull()
    {
    	if(top==9)
    		return true;
    	else
    		return false;
    }
    void spaceLeft()
    {
    	int left=9-top;
    	System.out.println(+left+" spaces are left.");
    }
    void Display()
    {
        System.out.println("The elements are ");
    	for(top=0;top<a.length;top++)
    	System.out.println(a[top]);
    }
    Stack()
    {
    	top=-1;
    }
}
class Stacktest
{
	public static void main(String args[])
	{
		int choice,num;
		int R=1;
		Scanner S1=new Scanner(System.in);
		Stack S=new Stack();
        
        do
        {
        System.out.println("Enter 1 to push.\nEnter 2 to pop.\nEnter 3 for isempty.\nEnter 4 for isfull.\nEnter 5 for spaceleft.\nEnter 6 to display.");
        
        
        
        	choice=S1.nextInt();
        switch(choice)
        {
        	case 1:
        	System.out.println("Enter the number you want to enter in the stack.");
        	num=S1.nextInt();
        	S.Push(num);
        	break;
        	case 2:
        	S.Pop();
        	break;
        	case 3:
            S.isEmpty();
            System.out.println("The stack is empty.");
            break;
            case 4:
            S.isFull();
            System.out.println("The stack is full.");
            break;
            case 5:
            S.spaceLeft();
            break;
            case 6:
            S.Display();
            break;
            default: 
            System.out.println("Number entered is incorrect.");
        }
        System.out.println("If you want to continue, enter 1, else enter 2.");
        R=S1.nextInt();
        System.out.println("Enter the number you want to enter in the stack.");
        }while(R==1);

    }
}