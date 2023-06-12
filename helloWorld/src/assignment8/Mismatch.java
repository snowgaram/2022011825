package assignment8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum;
			
			sum = num1 + num2;
			
			System.out.println(sum);
		}
		catch(InputMismatchException e){
			System.out.println("InputMismatchException!");
		}
	}
}
