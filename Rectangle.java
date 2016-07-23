package practice;

public class Rectangle extends Quadrilateral{
	int length;
	int breadth;
	
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	public void area(){
		System.out.println("The Area of a Rectangle is: "+ length*breadth);
	}
	
	public void perimeter(int length, int breadth){
		
		System.out.println("The Perimeter of a Rectangle is: "+ 2*(length*breadth));
	}

}
