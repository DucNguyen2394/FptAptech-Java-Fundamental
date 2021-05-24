package abtractExample;

public class Circle extends Shape {
	String color;

	@Override
	void printArea() {
		System.out.println("Tinh dien tich Hinh Tron ");
		System.out.println("Nhap ban kinh: ");
		radius = scan.nextInt();
		System.out.println(radius * radius * 3.14);
		
	}
}
