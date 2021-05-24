package australianCricket;

public class Player {
	String name;
	int age;
	String gender;
	
	public Player(){
		
	}
	
	public Player(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void displayDetails(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
