package Lab05Ex01;

import java.util.Scanner;

public class Rectangle extends Shape {
	
	int length;
	int width;
	Scanner scan = new Scanner(System.in); 
	public Rectangle(){
		
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void getArea() {
		System.out.println("Nhập mầu: ");
		color = scan.nextLine();
		System.out.println("Tinh dien tich HCN ");
		System.out.println("Nhap chieu dai va rong: ");
		width = scan.nextInt();
		length = scan.nextInt();
		System.out.println(width * length);
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangle [length=" + length + ", width=" + width + "]";
	}

	public void display(){
		System.out.println(toString());
	}

	
}
