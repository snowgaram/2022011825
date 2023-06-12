package assignInterface;

public class Circle implements Shape{
	private int r;
	
	Circle(int r){
		this.r = r;
	}
	
	public void getArea() {
		System.out.println("Circle area: " + (double)(3.141592 * this.r * this.r));
	}
}
