package assignmentClass;

import java.util.Scanner;

public class SwitchButton {
	public static void main(String args[]){
		Electric e = new Electric();
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("công tắc: ");
		do{
			a = scan.nextInt();
			if(a == 1){
				e.status = true;
				e.lamp();
			}
			if(a == 0){
				e.status = false;
				e.lamp();
			}
		}while(a != 2);
	}
}
