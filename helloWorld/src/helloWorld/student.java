package helloWorld;

/*public class Student {
	String name;
	int studentid;

	Student(String name, int id){
		name = name;
		studentid = studentid;
	}
	
	void printName() { // 이름을 출력하는 함수 정의
		System.out.println(name);
		System.out.println(studentid);
	}
	
	public static void main(String[] args) {
		Student jessy = new Student("jessy", 123);
		jessy.printName();
	}
}*/

public class student{  // 구조체 역할을 하는 class 정의
	String name;
	int studentID;
	String email;
	String phnenumber;
	boolean isMaile;

	void printName() { // 이름을 출력하는 함수 정의
		System.out.println(name);
	}
	
	void sayHi() {
		System.out.println("Hi, my name is..." + name);
	}

	public static void main(String[] args) { // 메인함수 
		student shiloh = new student(); // shiloh 라는 구조체 변수 정의 후 메모리 할당
		shiloh.sayHi();
		shiloh.name = "shiloh jolie-pitt"; // 구조체 변수에 이름 입력
		shiloh.printName();  // 함수 출력
		shiloh.isMaile = true;
		System.out.println(shiloh.isMaile);
	}
}