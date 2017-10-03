package datingGame;
import java.io.*;

/**
  Driver class for The Dating Game programming assignment.
  @author Jon Sorenson
*/
public class Year3000
{
	public static void main(String [] args) throws IOException, InterruptedException
	{
		DateInterface d = new MyDate();
		d.set(1,25,2015,0);  // sets the date to Sunday, January 25th, 2015
		while(d.getYear() < 3000)
		{
			d.tomorrow();
			// un-comment the next line to help with debugging
			//System.out.println(d);
		}
		System.out.println(d);
		d.set(1, 25, 2015, 0); // sets date to Sunday, January, 25th, 2015
		while(d.getYear() > 1799)
		{
		// at this point, d represents January 1, 1800	
			d.yesterday();
			//System.out.println(d);
		}
		// at this point, d represents January 1, 3000
		d.tomorrow();
		System.out.println(d);
	}
}
