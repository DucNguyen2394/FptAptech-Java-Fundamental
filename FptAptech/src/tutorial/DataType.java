package tutorial;

public class DataType {
	// Chữ đầu tiên viết hoa là 1 class.
	// Array, class, interface là kiểu dữ liệu tham chiếu.
	// Độ ưu tiên not ! -> and && -> or ||.
	// c = (a > b) ? a : b. Nếu a > b thì a gán cho c, còn ko thì b gán cho c.
	
	// Chỉ truy cập trong cùng 1 class.
		private String name;
	// 
		protected Integer account;
		
	// get là để đọc. set là để ghi dữ liệu.
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
	
	public static void main(String args[]){
		int a = 10;
		Integer b = 20;
		String c = "hello";
		
		// ép kiểu(casting) ngầm định.
		short num = 100;
		 int inNum = num;
		 System.out.println(inNum);
		 
		 // ép kiểu tường minh.
		 short num1 = 200;
		 int inNum1 = (short) num1;
		 System.out.println(inNum1);
		 
		 DataType data = new DataType();
		 data.setName("anh duc");
		 System.out.println("Name: " + data.getName());
	}
}
