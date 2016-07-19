
public class Triangle {
	
	float breadth;
	float height;
	
	public Triangle(float breadth, float height) {
		
		this.breadth = breadth;
		this.height = height;
	}
	
	public void findArea(){
		System.out.println("The area of Triangle is: "+ 0.5*breadth*height);
	}

}
