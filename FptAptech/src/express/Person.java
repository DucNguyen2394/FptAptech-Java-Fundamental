package express;

import java.util.Scanner;

public class Person {
	private String id;
	private String name;
	static Scanner scan = new Scanner(System.in);

	public Person(){
		
	}
	
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void input(){
		System.out.println("Enter ID: ");
		id = scan.nextLine();
		System.out.println("Enter name: ");
		name = scan.nextLine();
	}

	@Override
	public String toString() {
		System.out.println("[id=" + id + ", name=" + name + "]");
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
