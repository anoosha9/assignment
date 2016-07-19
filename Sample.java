import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		float radius = scanner.nextFloat();

		Circle obj = new Circle(radius);

		obj.area();
		obj.circumference();

		System.out.println("Enter the value of length");
		float length = scanner.nextFloat();
		System.out.println("Enter the value of breadth");
		float breadth = scanner.nextFloat();
		Rectangle rect = new Rectangle(length, breadth);
		rect.findarea();
		rect.perimeter();
		System.out.println("Enter the value of base");
		float base = scanner.nextFloat();
		System.out.println("Enter the value of height");
		float height = scanner.nextFloat();
		Triangle tri = new Triangle(base, height );
		tri.findArea();

	}

}
