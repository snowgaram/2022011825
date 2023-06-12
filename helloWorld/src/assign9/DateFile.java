package assign9;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFile {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm;ss;");
		//SimpleDateFormat sentence = new SimpleDateFormat("The best way to predict your future is to create it.");
		
		/*public SimpleDateFormat(String pattern)
	    {
	        this(pattern, Locale.getDefault(Locale.Category.FORMAT));
	    }*/
		try {
			FileOutputStream file = new FileOutputStream("TimeLog.txt");
			
			
			file.write(format.format(d1).getBytes());
			
			file.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

/*The best way to predict your future is to create it.
Seize the day.
Better late than never.
Practice makes perfect.*/