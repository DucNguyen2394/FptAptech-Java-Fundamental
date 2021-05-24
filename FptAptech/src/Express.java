import java.util.Scanner;

public class Express {
	static Scanner scan = new Scanner(System.in);
	private String name;
	private int packages;
	private int travel;
	
	public Express(){
		
	}
	
	public Express(String name, int packages, int travel){
		this.name = name;
		this.packages = packages;
		this.travel = travel;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPackages() {
		return packages;
	}

	public void setPackages(int packages) {
		this.packages = packages;
	}

	public int getTravel() {
		return travel;
	}

	public void setTravel(int travel) {
		this.travel = travel;
	}
	
	public int salary(){
		int salary = packages + travel;
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		return salary;
	}

	public static void main(String args[]){
		Express perEmployee = new Express("Anh Duc",50, 75);
		Express temEmployee = new Express("Van Duy", 30, 65);
		
		int choose;
		do{
			showMenu();
			System.out.println("Choose: ");
			choose = scan.nextInt();
			switch(choose){
			case 1:
				perEmployee.salary();
				break;
			case 2:
				temEmployee.salary();
				break;	
				
			}
		}while(choose != 3);
		
	}	
	public static void showMenu(){
		System.out.println("1. Xem luong nhan vien co dinh ");
		System.out.println("2. Xem luong nhan vien tam thoi ");
		System.out.println("3. Thoat");
	}
}
