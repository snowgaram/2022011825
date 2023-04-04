package helloWorld;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

//assignment #3
/*public class Hello{
	public static void main(String[] args) {
		int i = 0; 
		int j = 0; 
		int k = 0; 
		HashSet<String> set1 = new HashSet<String>(); 
		HashSet<String> set2 = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a song: "); 
		String sentence = scan.nextLine();
		String[] words = sentence.split(" "); 
		while (words.length > i) { 
			set1.add(words[i]); 
			i++;
		}
		int wordCount = countWords(sentence); 
		System.out.println("Array word count: " + wordCount);
		System.out.println(set1);
		System.out.println("Set word size: " + set1.size());
		System.out.println();
		System.out.print("LowerCase - version"); 
		while (words.length > j) { 
			set2.add(words[j].toLowerCase() + " "); 
			j++;
		}
		System.out.println(set2);
		System.out.println("Set word size " + set2.size());
	}
	
	public static int countWords(String sentence) { 
		String[] words = sentence.split(" "); 
		return words.length;
	}
}*/
/*public class Hello{
	public static void main(String[] args) {
		int[][] matrix1 = { {1, 0, 2}, {-1, 3, 1} }; 
		int[][] matrix2 = { {3, 1}, {2, 1}, {1, 0} }; 
		int[][] answer = new int[matrix1.length][matrix2[0].length];
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) 
			{
				for (int k = 0; k < matrix1[0].length; k++) {
					answer[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		} 
		System.out.println(Arrays.deepToString(answer));
	}
}*/

/*public class Hello{ //팀별 프로젝트
	public static void main(String[] args) { 
		int i = 0;
		int count = 10, num;
		Scanner scan = new Scanner(System.in);
		while (i < count) {
			System.out.println("1.Add Food Materials"); 
			System.out.println("2.Delete Food Materials"); 
			System.out.println("3.Edit Food Materials"); 
			System.out.println("4.View Food Materials"); 
			System.out.println("5.Show A Menu"); 
			System.out.println("6.Exit"); 
			System.out.println("Select one number between 1 ~ 6: "); 
			num = scan.nextInt();
			
			switch (num) { 
			case 1:
				// 식재료 추가: 식재료 이름및 유통기한, 원산지 등 입력 
				addFoodMaterials(); 
				break;
			case 2:
				// 제가할 식재료 이름 입력 
				deleteFoodMaterials(); 
				break;
			case 3:
				editFoodMaterials(); 
				break;
			case 4:
				viewFoodMaterials(); 
				break;
			case 5:
				continue;
			case 6:
				break;
			}
			i++;
		}
	}
	
	public static void addFoodMaterials() {
		Scanner scan = new Scanner(System.in); 
		System.out.print("FoodM name: "); 
		String FoodName = scan.nextLine(); 
		System.out.println(FoodName);
		System.out.print("FoodM deadline: "); 
		String FoodDate = scan.nextLine(); 
		String[] YMD = FoodDate.split("."); 
		for (int i = 0; i < YMD.length; i++) { 
			System.out.print(YMD[i] + " ");
		}
		System.out.print("FoodM origin: "); 
		String Foodorgin = scan.next();
	}
	
	public static void deleteFoodMaterials() { 
		Scanner scan = new Scanner(System.in); 
		System.out.print("FoodM name: "); 
		String FoodName = scan.nextLine(); 
		System.out.println(FoodName);
	}
	
	public static void editFoodMaterials() {
		Scanner scan = new Scanner(System.in); 
		System.out.print("FoodM name: "); 
		String FoodName = scan.nextLine(); 
		System.out.println(FoodName);
	}
	
	public static void viewFoodMaterials() {
		Scanner scan = new Scanner(System.in); 
		System.out.print("FoodM name: "); 
		String FoodName = scan.nextLine(); 
		System.out.println(FoodName);
	}
}*/

/*public class Hello {
	public static void main(String[]argu) throws IOException { 
		Random rand = new Random(); 
		Scanner scan = new Scanner(System.in);
		int rannum = rand.nextInt(1, 3); 
		char answer;
		System.out.print("H or T: "); 
		int input = System.in.read();
		if (rannum == 1) { 
			answer = 'H';
		} 
		else {
			answer = 'T';
		}
		if (input == answer) { 
			System.out.println("correct");
		} 
		else {
			System.out.println("incorrect");
		}
		System.out.println(rannum);
	}
}*/

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

//public class Hello{ // 03.28 수업내용(변수, 배열)
	/*public static int printSquare(int a) {
		return a++;
	}
	
	public static void main(String[] args) {
		int a = 45;
		System.out.println("1: " + a);
		int b = printSquare(a);
		System.out.println("2: " + b);
	}*/
	/*public static void main(String[] args) {
		int[] values = { 12, 24, -23, 47 };
		for(int i=0;i<4;i++) {
			System.out.println(values[i]);
		}
	}*/
	/*public static void main(String[] args) { // 배열 크기
		int[] values = new int[12];
		int size = values.length;
		int[] values2 = {1,2,3,4,5};
		int size2 = values2.length;
		System.out.println(size);
		System.out.println(size2);
	}*/
	
	//03.30 실습
	/*public static void main(String[] args) { //LAB: Find Maximum Number
		int[] number = {1, 120, 56, 78, 87};
		int maximum_number = 0;
		for(int i=0; i<number.length;i++) {
			if(maximum_number < number[i]) {
				maximum_number = number[i];
			}
		}
		System.out.println(maximum_number);
	}*/

//public class Hello{
	/*public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "Hello Java";
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("equals");
		}
		else {
			System.out.println("different");
		}
	}*/
	
	/*public static void main(String[] args) {
		String str1 = "Hello Java";
		
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,5));
		
		System.out.println(str1.replace("Java","Python"));
		System.out.println(str1.toLowerCase());
	}*/