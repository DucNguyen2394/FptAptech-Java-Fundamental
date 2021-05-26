package elvisBank;
import java.util.Scanner;

public class Bank {
	private static String bankId = "696969";
	private static String BankName = "Elvis";
	private String branch;
	
	Scanner scan = new Scanner(System.in);
	public Bank(){
		
	}
	
	public Bank(String bankId, String bankName, String branch) {
		super();
		this.bankId = bankId;
		BankName = bankName;
		this.branch = branch;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void displayAccountDetails(Account account){
		System.out.println("Bank ID: " + bankId + ", Bank name: " + BankName + ", Branch: " + branch);
		account.display();
	}
	public void createAccount(Account account){
		account.input();
		System.out.println("Branch: ");
		branch = scan.nextLine();
	}
	public void withdraw(Account account){
		try{
			double amount;
			boolean check;
			System.out.println("Enter your amount to withdrawal: ");
			amount = Double.parseDouble(scan.nextLine());
			if(amount <= account.getBalance()){
				check = true;
				account.setBalance(account.getBalance() - amount) ;
				System.out.println("Successfully!");
			}else{				
				throw new MyException(account);
			}
		}catch(MyException e){
			System.out.println("Invaid!!!");
		}catch(NumberFormatException e){
			System.out.println("money not String");
		}
	}
	public void deposit(String accountNumber, double amount){
		
	}
}
