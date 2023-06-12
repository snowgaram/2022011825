package assignment8;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		try {
			int num = readNum();
		}
		catch(MyException e) {
			System.out.printf("Error, %d is odd", e.getNum());
		}
	}
	
	public static int readNum() throws MyException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 != 0) {
			throw new MyException(num);
		}
		return num;
	}
}
