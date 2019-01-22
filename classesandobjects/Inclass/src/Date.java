class Date
{
	int day,month,year;
	Date()
	{
         day=1;
         month=1;
         year=2000;
	}
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void Display()
	{
		System.out.println(+day+"/"+month+"/"+year);
	}	
}
class Datetest
{   
	public static void main(String args[])
	{
	Date D=new Date(5,8,2019);
	D.Display();
	}
}