package Day.Time.Main;
import Day.Time.Application.*;
import java.util.Scanner;
public class day_main {

	private static Scanner input;
	public static void main(String[] args)
	{
int newday = 0;
int newmonth = 0;
int newyear = 0;

input = new Scanner (System.in);

System.out.println("Please input day,month,year\n");
newday = input.nextInt();
newmonth = input.nextInt();
newyear = input.nextInt();
day_app newcalander = new day_app(newday,newmonth,newyear);

System.out.printf("The current Day/Month/Year is: %s / %s / %s", newcalander.getday(),newcalander.getmonth(),newcalander.getyear());

	}

}
