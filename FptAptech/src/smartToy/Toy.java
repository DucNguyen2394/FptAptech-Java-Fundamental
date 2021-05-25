package smartToy;

public class Toy {
	String id;
	String name;
	float price;
	String type;
	
	public Toy(){
		
	}
	
	public Toy(String id, String name, float price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	public void display(){
		System.out.println(toString());
	}
}
