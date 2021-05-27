package elvisBank;

import java.util.Scanner;

public class MyException extends Exception {
	
	public MyException(double amount,double balance,String s){
		if(amount > balance){
			System.out.println(s);
		}
	}
	
}
