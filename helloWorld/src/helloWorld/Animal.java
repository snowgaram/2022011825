package helloWorld;

import java.util.ArrayList;

public class Animal {
	String name;
	String crysound;
	
	ArrayList<String> animal = new ArrayList();
	
	void bark() {
		Cat cat = new Cat();
		Cow cow = new Cow();
		Dog dog = new Dog();
		Lion lion = new Lion();
		
		cat.crysound = "야옹";
		cow.crysound = "음메";
		dog.crysound = "멍멍";
		lion.crysound = "으르렁";
	}
}
