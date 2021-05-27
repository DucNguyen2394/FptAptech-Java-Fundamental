package Lab06Part02;

public class MoreClass {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1);
		
		Object obj2 = new Object(){
		public String toString(){
			return "This is Obj2";
		}
		};
		System.out.println(obj2);
	}
	// Why System.out.println(obj1); could be displayed?
	// obj1 in ra địa chỉ của obj1.
	// obj 2 in ra kết quả được return trong phương thức toString.
}
