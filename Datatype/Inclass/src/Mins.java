class Mins
{
	public static void main(String args[])
	{
	int totalmins=60*24*365;
	int givenmins=46000;
	int years=(givenmins/totalmins);
	int months=(givenmins/60/24/31);
	int days=(givenmins/60/24);
	System.out.println("Minutes= "+givenmins+"\nYears= "+years+"\nMonths= "+months+"\nDays= "+days);
	}
}