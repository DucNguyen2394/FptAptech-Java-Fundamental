package examADF1;

import java.util.Scanner;

public class Circle extends GeometricObject {
	double radius;
	static final float PI = (float) 3.14;
	
	Scanner scan = new Scanner(System.in);
	public Circle(){
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void display() {
		super.display();
		System.out.println(toString());
	}
	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ",]";
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	public double getArea() {
		area = this.radius * this.radius * PI;
		System.out.println("DT hinh tron la: " + area);
		return area;
	}

	@Override
	public double getPerimeter() {
		double d = this.radius * 2;
		double perimeter = d * PI;
		System.out.println("Chu vi hinh tron la: " + perimeter);
		return perimeter;
	}
	
	public void input(){
		double area;
		System.out.println("Nhap ban kinh hinh tron");
		radius = Double.parseDouble(scan.nextLine());
		System.out.println("Nhap mau: ");
		color = scan.nextLine();
		
	}
	
}
