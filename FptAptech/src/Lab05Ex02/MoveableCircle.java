package Lab05Ex02;

public class MoveableCircle extends MoveablePoint implements Moveable {

	int radius;
	MoveablePoint center;
	
	
	
	public MoveableCircle(int radius, MoveablePoint center,int x,int y,int xSpeed, int ySpeed) {
		super();
		this.radius = radius;
		this.center = center;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getX() {
		return super.getX();
	}

	public void setX(int x) {
		super.setX(x);
	}

	public int getY() {
		return super.getY();
	}

	public void setY(int y) {
		super.setY(y);
	}

	public void input() {
		super.input();
	}

	public String toString() {
		return super.toString();
	}

	public void display() {
		super.display();
		System.out.println("Nhap Ban kinh");
	}

	public void moveUp() {
		
	}

	public void moveDown() {
		
	}

	public void moveLeft() {
		
	}

	public void moveRight() {
		
	}

}
