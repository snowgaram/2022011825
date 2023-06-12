package assignInterface;

public class Rectangle implements Shape{
	private int wide, high;

	Rectangle(int wide, int high) {
	this.wide= wide;
	this.high= high;
	}

	public void getArea() {
	System.out.println("Rectangle area: "+ (double)(this.wide* this.high));
	}

}
