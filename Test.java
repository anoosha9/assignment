package com;

import java.util.Scanner;

import practice.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter length of the Square");
		
		int length = scanner.nextInt();
		
		Square square = new Square(length);
		
		square.area();
		square.perimeter(length);
		
		System.out.println("Enter length of the Rectangle");
		
		int len=scanner.nextInt();
		
		System.out.println("Enter breadth of the Rectangle");
		
		int breadth=scanner.nextInt();
		
		Rectangle rect=new Rectangle(len, breadth);
		
		rect.area();
		rect.perimeter(len, breadth);
		
        System.out.println("Enter length of the Trapezium");
		
		int len2=scanner.nextInt();
		
		System.out.println("Enter breadth of the Trapezium");
		
		int breadth2=scanner.nextInt();
		
		System.out.println("Enter breadth of the Trapezium");
		
		int height=scanner.nextInt();
		
		
		Trepezium trap=new Trepezium(len2, breadth2, height);
		
		trap.area();
		
		
        System.out.println("Enter base of the Parallelogram");
		
		int base=scanner.nextInt();
		
		System.out.println("Enter height of the Parallelogram");
		
		int height1=scanner.nextInt();
		
		Parallelogram para=new Parallelogram(base, height1);
		
		para.area();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
