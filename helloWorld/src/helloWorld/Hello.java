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

//2. For an assignment, you have to submit two exercises in today’s class: 
/*public class Hello{ //assignment 2 - (1)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input:");
		String E = input.nextLine();
		System.out.println(E);
	}
}*/
/*public class Hello{ //assignment 2 - (2)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fahrenheit temperature:");
		int F = input.nextInt();
		float C = ((float)F - 32)*5/9;
		System.out.println("Celsius temperature:" + C);
	}
}*/
/*public class Hello{
	public static void main(String[] args) {
		System.out.println("1. Add Food Materials");
		System.out.println("2. Delete Food Materials");
		System.out.println("3. Edit Food Materials");
		System.out.println("4. View Food Materials");
		System.out.println("5. Exit");
	}
}*/

public class Hello{
	public static void main(String[] args) {
		/*System.out.print("Input Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int i = 0;
		while(i < num) {
			if(i % 2 != 0) {
				System.out.print(i);
			}
			i += 1;
		}*/
		
		// * 이 기호로 사각형이나 삼각형 만들기
		/*for(int i =5;i>0;i--) {
			for(int j=i; j>0 ; j--) {
				System.out.print("");
			}
			for(int k=0;k<5;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
		// 3월 23일 class
		for(int i=2;i<10;i++) {
			if(i==5) {
				System.out.print("\n");
				break;
			}
			for(int j=1;j<10;j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.print("\n");
		}
	}
}