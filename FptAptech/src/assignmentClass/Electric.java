package assignmentClass;

public class Electric {
	boolean status;
	
	public Electric(){
		
	}

	public Electric(boolean status) {
		super();
		this.status = status;
	}
	
	public void turnOff(){
		System.out.println("turn off");
		status = false;
	}
	
	public void turnOn(){
		System.out.println("turn on");
		status = true;
	}
	
	public boolean lamp(){
		if(status == true){
			System.out.println("đèn bật");
		}
		else{
			System.out.println("đèn tắt");
		}
		return status;
	}
	
}
