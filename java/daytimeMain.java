package hw8_15;
public class daytimeMain {

	public static void main(String[] args)
	{
		daytimeclass calender = new daytimeclass();
		
		calender.setDayMonthYear();
		calender.daytimeclass(calender.month, calender.day , calender.year);
		calender.daytimeclass(calender.monthy(calender.month), calender.day, calender.year);
		calender.daytimeclass(calender.dayofyear, calender.year);	

	}

}
