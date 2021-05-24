package assignmentClass;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void display(){
		for(int i = 0; i < width; i++ ){
			for(int j = 0; j < height; j++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String args[]){
		Rectangle rectangle = new Rectangle();
		rectangle.width = 5;
		rectangle.height = 7;
		rectangle.display();
	}
}
