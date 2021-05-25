package Lab05Ex01;

import java.util.Scanner;

public class Triangle extends Shape {
	int base;
	int height;
	Scanner scan = new Scanner(System.in); 

	public Triangle(){
		
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	void getArea() {
		System.out.println("Nhập mầu: ");
		color = scan.nextLine();
		System.out.println("Tinh dien tich hinh tam giac ");
		System.out.println("Nhap chieu dai va đáy: ");
		
	}

	@Override
	public String toString() {
		return super.toString() + "Triangle [base=" + base + ", height=" + height + "]";
	}
	
	public void display(){
		System.out.println(toString());
	}
	
}
