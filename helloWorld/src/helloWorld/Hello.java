package helloWorld;
import java.util.Scanner;

/*public class Hello {
   public static void main(String[] args) {
      int i = 0;
      int count = 10 , num;
      Scanner scan = new Scanner(System.in);
      
      while (i < count){
    	  System.out.println("1.Add Food Materials");
          System.out.println("2.Delete Food Materials");
          System.out.println("3.Edit Food Materials");
          System.out.println("4.View Food Materials");
          System.out.println("5.Show A Menu");
          System.out.println("6.Exit");
          System.out.println("Select one number between 1 ~ 5:");
          num = scan.nextInt();
          
          switch(num) {
          case 1:
             System.out.print("Input Food Materials Name to Add:");
             String nameA = scan.next();
             System.out.print("Input Food Materials Deadline:");
             int month = scan.nextInt();
             int date = scan.nextInt();
             System.out.print("\n");
             break;
          case 2:
             System.out.print("Input Food Materials Name to Delete:" );
             String nameD = scan.next();
          case 3:
             System.out.print("Input Food Materials Name to Edit:");
          case 4:
          case 5:
          case 6:
        	 System.out.print("\n");
             break;
          }
          i++;
      }
   }
}*/

//package helloWorld;
//import java.util.Scanner;
//import java.io.IOException;

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
/*public class Hello{ // with 서문성
	public static void main(String[] args) {
		System.out.println("1. Add Food Materials");
		System.out.println("2. Delete Food Materials");
		System.out.println("3. Edit Food Materials");
		System.out.println("4. View Food Materials");
		System.out.println("5. Exit");
	}
}*/

/*public class Hello{
	public static void main(String[] args)  //throws IOException{
		/*System.out.print("Input Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int i = 0;
		while(i < num) {
			if(i % 2 != 0) {
				System.out.print(i);
			}
			i += 1;
		}
		
		// * 이 기호로 사각형이나 삼각형 만들기
		for(int i =5;i>0;i--) {
			for(int j=i; j>0 ; j--) {
				System.out.print("");
			}
			for(int k=0;k<5;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		// 3월 23일 class
		/*for(int i=2;i<10;i++) {
			if(i==5) {
				System.out.print("\n");
				break;
			}
			for(int j=1;j<10;j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.print("\n");
		}*/
		
		//assignment 2 - (1)
/*public class Hello{
	public static void main(String[] args) {
		int num = 100000;
		int d, h, m, s;
		
		s = 100000 % 60;
		m = (100000 / 60) % 60;
		h = (100000 / (60 * 60)) % 24;
		d = (100000 / (60 * 60)) / 24;
		System.out.print("100000s = " + d + " day " + h + " hours " + m + " minutes " + s + " seconds ");
	}
}*/

		//assignment 2 - (2)
/*package helloWorld;
import java.util.Scanner;
import java.io.IOException;

public class Hello{
	public static void main(String[] args)  throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number 1:");
		int num1 = input.nextInt();
		System.out.print("Input Number 2:");
		int num2 = input.nextInt();
		System.out.print("Input Operateor:");
		int oper;
		oper = System.in.read();
		
		if(oper == 43) {
			System.out.print(num1 + " + " + num2 + " = " + (num1+num2));
		}
		else if(oper == 45) {
			System.out.print(num1 + " - " + num2 + " = " + (num1-num2));
		}
		else if(oper == 42) {
			System.out.print(num1 + " * " + num2 + " = " + (num1*num2));
		}
		else if(oper == 47) {
			System.out.print(num1 + " / " + num2 + " = " + (num1/num2));
		}
		else {
			System.out.print("Error");
		}
	}
}*/
public class Hello{
	public static void printSquare(double x) {
		System.out.println(x*x);
	}
	
	public static void main(String[] args) {
		printSquare(5);
	}
}