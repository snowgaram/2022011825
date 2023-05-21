package helloWorld;

public class Tester {
	static void inc(int a) {
		a++;
	}
	public static void main(String[] args) {
		int a = 45;
		System.out.println("1: " + a);
		inc(a);
		System.out.println("2: " + a);

		//Dude dude = new Dude();
		//Dude grandwizard = new GrandWizard();
		//grandwizard.name = "abc";
		//dude.sayName();
		//grandwizard.sayName();
// 막내(자식)인 grandwizard 이름에 값 대입. 따라서 부모인 dude와 wizard에는 공백
	}
}

/*class Shape{
	public void printInfo() {
		System.out.println("shape");
	}
}
class Line extends Shape{
	public void printInfo() {
		System.out.println("line");
	}
}
public class Tester{
	public static void main(String[] args) {
		Shape s = new Line(); // upcasting
//		Line q = new Shape(); // donwcasting 
		s.printInfo();
	}
}*/