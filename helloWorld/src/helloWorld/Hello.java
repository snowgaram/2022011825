package helloWorld;
import java.util.Scanner;

/*public class Hello {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input:");
		int ival = input.nextInt();
		System.out.println(ival);
	}
}*/

public class Hello{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input:");
		String A = input.nextLine();
		System.out.println(A);
	}
}
/*public class Hello{ //온도 변화
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fahrenheit temperature:");
		int F = input.nextInt();
		float C = ((float)F - 32)*5/9;
		System.out.println(C);
	}
}*/