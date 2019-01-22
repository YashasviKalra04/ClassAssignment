class Point2
{
	private double x1,y1,x2,y2;
	Point2()
	{
		System.out.println("");
	}
	Point2(int x1,int x2)
	{
		this.x1=x1;
		this.x2=x2;
	}
	Point2(int x1,int x2,int y1,int y2)
	{
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	public double getx1()
	{
		return x1;
	}
	public double getx2()
	{
		return x2;
	}
	public double gety1()
	{
		return y1;
	}
	public double gety2()
	{
		return y2;
	}
	public void setx1(int x1)
	{
		this.x1=x1;
	}
	public void setx2(int x2)
	{
		this.x2=x2;
	}
	public void sety1(int y1)
	{
		this.y1=y1;
	}
	public void sety2(int y2)
	{
		this.y2=y2;
	}
	static Double Distance(Point2 P1,Point2 P4)
	{
		Double dis;
		dis=Math.sqrt(Math.pow((P4.getx2()-P1.getx1()),2)+Math.pow((P4.gety2()-P1.gety1()),2));
		return dis;
	}
}
