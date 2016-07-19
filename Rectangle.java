
public class Rectangle {
	
	float length;
	float breadth;
	public Rectangle(float length, float breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void findarea(){
		
		System.out.println("The area of the Rectangle is: "+ length*breadth);
	}
	
	public void perimeter(){
		System.out.println("The perimeter of Rectangle is : "+ 2*(length*breadth));
	}
	
	
	


}
