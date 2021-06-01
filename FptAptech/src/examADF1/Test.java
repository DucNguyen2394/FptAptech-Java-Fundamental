package examADF1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String args[]){
		ArrayList<Circle> c = new ArrayList<>();
		ArrayList<Rectangle> r = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		int choose;
		
		do{
			System.out.println("Ban chon: ");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose){
			case 1:
				Circle circle = new Circle();
				circle.input();
				circle.getArea();
				circle.getPerimeter();
				circle.display();
				c.add(circle);
				break;
			case 2:
				Rectangle rectangle = new Rectangle();
				rectangle.input();
				rectangle.getArea();
				rectangle.getPerimeter();
				rectangle.display();
				r.add(rectangle);
				break;
			case 3:
				System.out.println("Tam biet ");
				break;
			default:
				System.out.println("Khong hop le");
				break;
			}
		}while(choose != 3);
	}
	
	public void menu(){
		System.out.println("1. Chon hinh tron ");
		System.out.println("2. Chon hinh chu nhat ");
		System.out.println("3. Thoat ");
		
	}
}
