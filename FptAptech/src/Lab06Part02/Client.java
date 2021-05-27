package Lab06Part02;

public class Client {
	
	public Client(){
		
	}
	
	public void doUnchecked(String value){
		int result = canThrowUncheckedException(value);
	}
	
	private int canThrowUncheckedException(String value) {
		return Integer.parseInt(value);
	}
	
	public void doChecked() {
		try {
			canThrowCheckedException();
			System.out.println("ok");
		}catch(Exception ex) {
			System.out.println(ex);
		}
		}
	
	private int canThrowCheckedException() throws Exception{
		throw new Exception("Failure");
		}
	
	
	public static void main(String[] args){
		Client c = new Client();
	}
	
	// 1. Distinguishing unchecked Checked Exception and Exception:
	//Checked Exception : Việc kiểm tra được thực hiện ngay tại thời điểm chương trình đang được biên dịch.
	//unchecked Exception: việc kiểm tra tại thời điểm chương trình đang chạy.
	// 2. Using Checked Exception and use unchecked Exception:
	//unchecked Exception: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException...
	//Checked Exception: IOException, SQLException...
	// 3. Why should not catch (Exception ex)?
	//
}
