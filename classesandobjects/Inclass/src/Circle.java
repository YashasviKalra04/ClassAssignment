class Circle
{
	double r,a,c;
	Circle()
	{
		r=1;
	}
	Circle(double r)
	{
		this.r=r;
	}
	public double area()
	{
		a=3.14*r*r;
		return a;
	}
	public double circumference()
	{
		c=2*3.14*r;
		return c;
	}
    public void display()
    {
    	System.out.println("Area is= "+a);
    	System.out.println("Circumference is="+c);
    }
}
class Circledemo
{
	public static void main(String args[])
    {
        Circle C1=new Circle(5);
        C1.area();
        C1.circumference();
        C1.display();
    }
}