class Circle
{
	double radius;
	String color="red";
	Circle()
	{
		radius=0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	double getRadius()
	{
		return radius;
	}
	void setRadius(double radius)
	{
        this.radius=radius;
	}
	String getColor()
	{
        return color;
	}
	void setRadius(String color)
	{
		this.color=color;
	}
	double getArea()
	{
        return 3.14*getRadius()*getRadius();
	}
}
class Cylinder extends Circle
{
	double height;
	Cylinder()
	{
        height=1;
	}
	Cylinder(double radius)
	{
		super(radius);
	}
	Cylinder(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	Cylinder(double radius,double height,String color)
	{
        super(radius,color);
        this.height=height;
	}
    double getHeight()
    {
    	return height;
    }
    void setHeight(double height)
    {
    	this.height=height;
    }
    double getVolume()
    {
    	return 3.14*getRadius()*getRadius()*getHeight();
    }
}
class Test
{
    public static void main(String args[])
    {
    	Cylinder C1=new Cylinder();
    	Cylinder C2=new Cylinder(5);
    	Cylinder C3=new Cylinder(5,10);
    	Cylinder C4=new Cylinder(5,10,"Black");
    	C1.setRadius(10);
    	C1.setHeight(20);
        System.out.println(C1.getArea());
    	System.out.println(C1.getVolume());
    }
}