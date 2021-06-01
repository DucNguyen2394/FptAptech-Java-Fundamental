package examADF1;

import java.util.Date;

public class GeometricObject {
	String color;
	boolean filled;
	Date dateCreate = new Date();
	double area;
	double perimeter;
	public GeometricObject(){
		
	}
	
	public GeometricObject(String color, boolean filled, Date dateCreate) {
		super();
		this.color = color;
		this.filled = filled;
		this.dateCreate = dateCreate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	
	public double getArea(){
		return area;
	}
	
	public double getPerimeter(){
		return perimeter;
	}

	public void display(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreate=" + dateCreate + ", area="
				+ area + ", perimeter=" + perimeter + "]";
	}
}
