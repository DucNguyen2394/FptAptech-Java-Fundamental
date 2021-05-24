package Lab04;

public class Cylinder extends Circle {
	double height;
	
	public Cylinder(){
		
	}
	public Cylinder(double height){
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void getVolume(){
		
	}
	@Override
	public double getRadius() {
		return super.getRadius();
	}
	@Override
	public void setRadius(double radius) {
		super.setRadius(radius);
	}
	@Override
	public String getColor() {
		return super.getColor();
	}
	@Override
	public void setColor(String color) {
		super.setColor(color);
	}
	
}
