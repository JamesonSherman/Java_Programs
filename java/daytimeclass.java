package hw8_15;
import java.util.Calendar;
import java.util.Date;
public class daytimeclass

{
	 public int day;
	 public int month;
	 public int year;
	 public int dayofyear;
	
	daytimeclass()
	{
		day =1;
		month = 1;
		year = 1;
		dayofyear = 1;
	}
	 
	public void daytimeclass(int month, int day, int year)
	 {
		 System.out.println(month + 1 + "/" + day + "/" +year);
	 }
	 
	 
	public void daytimeclass(String month, int day, int year)
	 {
		 System.out.println(month + " " + day + ", " + year);
	 }
	 
	public void daytimeclass(int one, int two)
	 {
		 System.out.println(one + " " + two);
	 }
	
	
	public void setDayMonthYear()
	{
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		
		int dayofMonth =  cal.get(Calendar.DAY_OF_MONTH);
		int MonthofYear = cal.get(Calendar.MONTH);
		int YearofYear = cal.get(Calendar.YEAR);
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		day = dayofMonth;
		month = MonthofYear + 1;
		year = YearofYear;
		dayofyear = dayOfYear;
	}
	
	
	public int sittogether()
	{
		 int time = 1;
		 while (time <= month)
			 time *= 10;
		 
		return day*time + month;
	}
	
	public String monthy(int month)
	{
		if (month == 1)
		{
			return "January";
		}
		else if (month ==2)
		{
			return "February";
		}
		else if (month == 3)
		{
			return "March";
		}
		else if (month == 4)
		{
			return "April";
		}
		else if (month == 5) 
		{
			return "May";
		}
		else if (month == 6)
		{
			return "June";
		}
		else if (month == 7)
		{
			return "July";
		}
		else if (month == 8)
		{
			return "August";
		}
		else if (month == 9)
		{
			return "september";
		}
		else if (month == 10)
		{
			return "october";
		}
		else if (month == 11)
		{
			return "november";
		}
		else
		{
			return "december";
		}
	}

	
}
