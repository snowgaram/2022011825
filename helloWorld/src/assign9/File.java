package assign9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class File {
	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Scanner sc = new Scanner(System.in);
			
			String answer;
			
			FileWriter file = new FileWriter("text.txt",true);
			
			for(int i = 0; i < 4 ; i++) {
				Date d1 = new Date();
				answer = sc.nextLine();
				file.write(format.format(d1));
				file.write("\t"+answer+"\n");
			}
			
			file.close();
		
			
			FileReader fileReader = new FileReader("text.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String s;
			
			while((s = bufferedReader.readLine()) != null){
				System.out.println(s);
			}
			
			bufferedReader.close();
			
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

