package datingGame;

public class MyDate implements DateInterface
{
	/**
	 * @param year the 4  digit year
	 * @param month the month of the year
	 * @param day the day of the month
	 * @param doWeek the day of the week
	 * @param String[] dows the array of days of the week
	 * @param String[] mont the array of months
	 */
	static int year;
	static int month;
	static int day;
	static int doWeek;
	static String[] dows = {"Sunday","Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
	static String[] mont = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	
	public int getDay()
	{
		/**
		 * @return the day of a  month
	 	*/
		return day;
	}
	
	public int getDow()
	{
		/**
		 * @return to the day of the week 
		 */
		return doWeek;
	}
	public int getMonth()
	{
		/**
		 * @return the week in the month
		 */
		return month;
	}
	public int getYear()
	{
		/**
		 * @return 4 digit year
		 */
		return year;
	}
	
	public void set(int m, int d, int y, int dow)
	{
		/**
		 * @param m is months (1-12)
		 * @param d is days of a month (1-31)
		 * @param y is year in 4 digits
		 * @param dow is day of the week (0-6)
		 */
		month = m;
		day = d;
		year = y;
		doWeek = dow;
	}

	public void tomorrow()
	{
		/**
		 * goes forward a day until maximum cap stated in Year3000.java is reached
		 */
		day++; //increment day
		doWeek++; //increment day of the week
		if (day > 31)
		{
			month++; //increment month
			day = 1; //set day one after month is incremented
		}
		if (month > 11)
		{
			year++; //increment year
			month = 0; //set month back 0 (Januaray) after year is incremented
		}
		if (doWeek > 6)
		{
			doWeek = 0; //set day of the week to 0 (Sunday)
		}
	}

	public void today()
	{
		
	}

	public void yesterday()
	{
		/**
		 * goes back a day until minimum cap stated in Year3000.java is reached
		 */
		day--; //decrement day
		doWeek--; //decrement day of the week
		if (day < 1)
		{
			month--; //decrement month
			day = 31; //set day to 31 after month is decremented
		}
		if (month < 0)
		{
			year--; //decrement year
			month = 11; //set month to 11 (December) after year is decremented
		}
		if (doWeek < 0)
		{
			doWeek = 6; //set day of the week equal to 6 (Saturday)
		}
	}
	
	public String toString()
	{
		/**
		 * @return prints out day of week month day, year
		 */
		return dows[doWeek] + " " + mont[month] + " " + day + ", " + year;
	}
}
