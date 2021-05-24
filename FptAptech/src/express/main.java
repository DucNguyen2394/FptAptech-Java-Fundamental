package express;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		ArrayList<PerEmployee> perEmployeeList = new ArrayList<>();
		ArrayList<TemEmployee> temEmployeeList = new ArrayList<>();
		
		int choose;
		do{
			showMenu();
			System.out.println("Choose: ");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose){
			case 1:
				System.out.println("1. Enter permanent employee number: ");
				int n;
				n = Integer.parseInt(scan.nextLine());
				for(int i = 0; i < n; i++ ){
					PerEmployee perEmployee = new PerEmployee();
					perEmployee.input();
					perEmployeeList.add(perEmployee);
				}
				
				break;
			case 2:
				System.out.println("2. Enter temporary employee number:");
				int m;
				m = Integer.parseInt(scan.nextLine());
				for(int i = 0; i < m; i++ ){
					TemEmployee temEmployee = new TemEmployee();
					temEmployee.input();
					temEmployeeList.add(temEmployee);
				}
				
				break;	
			case 3:
				for(int i = 0; i < perEmployeeList.size(); i++){
					 perEmployeeList.get(i).toString();
				}
				break;
			case 4:
				for(int i = 0; i < temEmployeeList.size(); i++){
					 temEmployeeList.get(i).toString();
				}
				break;
			case 5:
				System.out.println("Bye! ");
				break;
			default:
				System.out.println("Invalid!!!");
				break;
			}
		}while(choose != 5);
	}
	
	public static void showMenu(){
		System.out.println("1. Enter permanent employee number: ");
		System.out.println("2. Enter temporary employee number:");
		System.out.println("3. Show info permanent employee");
		System.out.println("4. Show info temporary employee");
		System.out.println("5. exit");
	}
	
}
