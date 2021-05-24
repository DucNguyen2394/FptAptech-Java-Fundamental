package howellUniversity;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		int choose,flag = 0;
		int count = 0;
		String n;
		do {
			showMenu();
			System.out.println("bạn chọn: ");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose) {
			case 1:if(flag == 1){
				break;
			}
				student.input();
				student.nangKhieu();
				flag = 1;
				break;
			case 2:
				if(flag == 1){
					student.tiengAnh();
					flag = 2;
				}
				if(flag == 2){
					break;
				}
				else{
					System.out.println("vui lòng chọn 1");
				}
				break;
			case 3:
				if(flag == 1){
					student.toan();
				}
				else{
					System.out.println("vui lòng chọn 1");
				}
				break;
			case 4:
				if(flag == 1){
					student.GK();;
				}
				else{
					System.out.println("vui lòng chọn 1");
				}
				break;
			case 5:
				if(student.getMark() == 10){
					System.out.println("học quá ngu");
				}
				if(student.getMark() == 20){
					System.out.println("học cực dốt");
				}
				if(student.getMark() == 30){
					System.out.println("học khá");
				}
				if(student.getMark() == 40){
					System.out.println("học khá quá");
				}
				if(student.getMark() == 50){
					System.out.println("thiên tài");
				}
				if(student.getMark() == 0){
					System.out.println("Đuổi học");
				}
				student.toString();
				break;
			case 6:
				System.out.println("Tạm biệt!");
				break;
			default:
				System.out.println("Chọn sai, vui lòng chọn lại! ");
				break;
			}
		}while(choose != 6);
	}
	
	public static void showMenu() {
		System.out.println("1. Môn năng khiếu");
		System.out.println("2. Tiếng anh");
		System.out.println("3. Toán");
		System.out.println("4. GK");
		System.out.println("5. Hiện thị thông tin");
		System.out.println("6. Thoát");
	}
}
