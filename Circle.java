
public class Circle {
	
	float radius;
	final float pi = 3.14f;
	
	

	public Circle(float radius) {
		this.radius = radius;
	}
	
	public void area(){
		System.out.println("The area of the circle is: "+ pi*this.radius*this.radius);
		
	}
	
	public void circumference(){
		System.out.println("The circumference of a circle is: "+ 2*pi*radius);
	}

}
