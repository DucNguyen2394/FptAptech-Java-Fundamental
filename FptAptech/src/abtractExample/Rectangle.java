package abtractExample;

public class Rectangle extends Shape {

	@Override
	void printArea() {
		System.out.println("Tinh dien tich HCN ");
		System.out.println("Nhap chieu dai va rong: ");
		width = scan.nextInt();
		height = scan.nextInt();
		System.out.println(width * height);
	}

}
