class Pointdistance
{
	public static void main(String args[])
	{
		Point P2=new Point(7,8);
		Point P3=new Point(10,15,20,22);
		double d1;
		/*P2.setx1(1);
		P2.sety1(2);
		P3.setx2(3);
		P3.sety2(4);*/
		d1=P3.Distance(P2);
		System.out.println(d1);
	}
}