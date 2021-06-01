package examADF1;

import java.util.Scanner;

public class Rectangle extends GeometricObject {
	double width;
	double height;
	Scanner scan = new Scanner(System.in);
	public Rectangle() {
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public void display() {
		super.display();
	}
	@Override
	public String getColor() {
		return super.getColor();
	}
	@Override
	public double getArea() {
		area = this.width * this.height;
		System.out.println("DT hinh chu nhat la: " + area);
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = (width + height) * 2;
		System.out.println("Chu vi hinh chu nhat la: " + perimeter);
		return perimeter;
	}
	public void input(){
		System.out.println("Nhap chieu dai HCN");
		width = Double.parseDouble(scan.nextLine());
		System.out.println("Nhap chieu rong HCN");
		height = Double.parseDouble(scan.nextLine());
		System.out.println("Nhap mau: ");
		color = scan.nextLine();
		
		
	}
	
	
}
