package assignmentClass;

public class temp {
	double cTemp;
	double Ftemp;
	
	public temp(){
		
	}
	
	public temp(double cTemp, double ftemp) {
		this.cTemp = cTemp;
		Ftemp = ftemp;
	}
	
	public double getcTemp() {
		return cTemp;
	}

	public void setcTemp(double cTemp) {
		this.cTemp = cTemp;
	}

	public double getFtemp() {
		return Ftemp;
	}

	public void setFtemp(double ftemp) {
		Ftemp = ftemp;
	}
	
	public void display(){
		Ftemp = 9 / 5 * (cTemp + 32);
		System.out.println("cTem = " + cTemp);
		System.out.println("FTem = " + Ftemp);
	}
	
	public static void main(String args[]){
		temp t = new temp();
		t.cTemp = 37;
		t.display();
	}
	
	
}
