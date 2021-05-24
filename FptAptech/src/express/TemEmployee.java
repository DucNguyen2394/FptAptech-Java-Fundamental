package express;

import java.util.Scanner;

public class TemEmployee extends Person {
	static Scanner scan = new Scanner(System.in);
	private int salary;
	private int salaryPackages;
	
	public TemEmployee(){
		
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int packages(){
		
		System.out.println("Enter employee's number package");
		int num = Integer.parseInt(scan.nextLine());
		if(num < 0){
			System.out.println("Invalid!!!");
		}
		else{
			salaryPackages = num * 30;
		}
		return salaryPackages;
	}
	
	public int packagesNumber() {
		return salaryPackages;
		
	}
	
	public int getSalary() {
		salary = packagesNumber() + temTravel() + shifts();
		System.out.println("Salary = " + salary);
		return salary;
	}
	
	public int temTravel(){
		return 65;
	}
	
	public int shifts(){
		return ((packagesNumber() + temTravel()) * 90) / 100;
	}
		
	@Override
	public void input() {
		super.input();
		packages();
	}

	@Override
	public String toString() {
		getSalary();
		return super.toString();
	}
	
	
}
