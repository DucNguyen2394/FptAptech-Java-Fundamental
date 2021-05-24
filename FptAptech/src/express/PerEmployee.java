package express;

import java.util.Scanner;

public class PerEmployee extends Person {
	static Scanner scan = new Scanner(System.in);
	private int salary;
	private int packageNum;
	
	public PerEmployee(){
		
	}
	
	public int getSalary(int packageNum) {
		salary = packagesNumber(packageNum) + temTravel() + shifts(packageNum);
		System.out.println("Salary = " + salary);
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int packagesNumber(int packageNum){
		int salaryPackages = 0;
		if(packageNum < 0){
			System.out.println("Invalid!!!");
		}
		else{
			salaryPackages = packageNum * 50;
		}
		return salaryPackages;
	}
	
	public void packages(){		
		System.out.println("Enter employee's number package");
		this.packageNum = Integer.parseInt(scan.nextLine());
	}
		
	public int temTravel(){
		return 75;
	}
	
	public int shifts(int packageNum){
		return ((packagesNumber(packageNum) + temTravel()) * 90) / 100;
	}
	
	@Override
	public void input() {
		super.input();
		packages();
	}

	@Override
	public String toString() {
		getSalary(packageNum);
		return super.toString();
	}
}
