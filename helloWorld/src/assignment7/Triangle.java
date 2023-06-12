package assignment7;

public class Triangle extends Shape{
	private int wide, high;
	
	Triangle(int wide, int high){
		this.wide = wide;
		this.high = high;
	}
	
	public void getArea() {
		System.out.println("Triangle area: " + (double)(this.wide * this.high / 2));
	}
}
