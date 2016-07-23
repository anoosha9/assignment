
package practice;
public class Square extends Quadrilateral {
	
	int length;
	
	
	public Square(int length) {
		
		this.length = length;
	}

	public void area(){
		
		System.out.println("The area of a Square is: "+ length*length);
	}
	 
	public void perimeter(int length){
		
		System.out.println("The Perimeter of a Square is: "+ 4*length);
	}

}
