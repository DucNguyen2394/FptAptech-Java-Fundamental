package elvisBank;

import java.util.Scanner;

public class Account {
	private String customerName;
	private String accountNumber;
	private double balance;
	
	public Account(){
		
	}

	public Account(String customerName, String accountNumber, double balance) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void display(){
		System.out.println(toString());
	}
	public String toString() {
		return "Account [customerName=" + customerName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Customer name: ");
		customerName = scan.nextLine();
		System.out.println("Account Number: ");
		accountNumber = scan.nextLine();
		System.out.println("Balance: ");
		balance = Double.parseDouble(scan.nextLine());
	}
}

