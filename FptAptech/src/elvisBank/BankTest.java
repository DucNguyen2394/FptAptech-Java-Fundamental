package elvisBank;

import java.util.Scanner;

public class BankTest {
	static Scanner scan = new Scanner(System.in); 
	public static void main(String args[]){
		Bank bank = new Bank();
		Account account = new Account();
		int choose;
		do{
			menu();
			System.out.println("Choose");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose){
			case 1:
				bank.createAccount(account);
				break;
			case 2:
				bank.displayAccountDetails(account);
				break;
			case 3:
				bank.withdraw(account);
				break;
			case 4:
				
				break;       
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Invalid!!!");
				break;
			}
		}while(choose != 7);
		
		
	}
	
	public static void menu(){
		System.out.println("1. Enter customer information ");
		System.out.println("2. Display customer information ");
		System.out.println("3. Withdraw:  ");
	}
	
//	public static void trycatch(){
//		try{
//			int[] list = new int[3];
//			list[0] = 5;
//			list[2] = 8;
//			list[8] = list[2] / list[0];
//			try{
//				int a = 50,b = 0;
//				int result = a/b;
//			}catch(ArithmeticException ex){
//				System.out.println("ko the chia cho 0");
//			}
//		}catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println("vuot qua kich thuoc mang");
//		}catch(Exception ex){
//			System.out.println("ko phat hien dc loi");
//		}
//	}
}

