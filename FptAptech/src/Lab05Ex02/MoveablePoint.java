package Lab05Ex02;

import java.util.Scanner;

public class MoveablePoint implements Moveable {

	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	Scanner scan = new Scanner(System.in);
	
	public MoveablePoint(){
		
	}
	
	public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

	public void moveLeft() {
		x--;
	}

	public void moveRight() {
		x++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void input(){
		System.out.println("Nhap x = ");
		x = scan.nextInt();
		System.out.println("Nhap y = ");
		y = scan.nextInt();
	}

	public String toString() {
		return "MoveablePoint [x=" + x + ", y=" + y + "]";
	}
	
	public void display(){
		System.out.println(toString());
	}

}
