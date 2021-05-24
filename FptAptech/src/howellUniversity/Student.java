package howellUniversity;

import java.util.Scanner;

public class Student {
		private String id;
		private String name;
		private int markNangkhieu;
		private int markTiengAnh;
		private int markToan;
		private int markGK;
		private int mark;
		Scanner scan = new Scanner(System.in);
		int n,count;
		
		public Student() {
			
		}
		
		public Student(String id, String name,int mark) {
			this.id = id;
			this.name = name;
			this.mark = mark;
		}
		
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void nangKhieu(){
			System.out.println("1.hát");
			System.out.println("2.vẽ");
			System.out.println("3.nhẩy");
			System.out.println("4.múa");
			n = scan.nextInt();
			if(n == 1){
				this.markNangkhieu = 10;
				System.out.println("Đúng");
				this.count  += this.markNangkhieu;
				System.out.println(count);
			}
			else{
				System.out.println("Sai");
			}
		}
		
		public void tiengAnh(){
			System.out.println("1. hello");
			System.out.println("2. how are you");
			System.out.println("3. im fine thank you");
			System.out.println("4. Thank you");
			n = scan.nextInt();
			if(n == 3){
				this.markTiengAnh = 10;
				System.out.println("Đúng");
				this.count = this.markTiengAnh + this.markNangkhieu;
				System.out.println(count);

			}
			else{
				System.out.println("Sai");
			}
		}
		
		public void toan(){
			System.out.println("1. 1 + 1 = 2");
			System.out.println("2. 2 + 2 = 6");
			System.out.println("3. 6 + 1 = 10");
			System.out.println("4. 5 + 5 = 7");
			n = scan.nextInt();
			if(n == 1){
				this.markToan = 10;
				System.out.println("Đúng");
				this.count += this.markToan + this.markNangkhieu + this.markTiengAnh;
			}
			else{
				System.out.println("Sai");
			}
		}
		
		public void GK(){
			System.out.println("1. abc");
			System.out.println("2. efg");
			System.out.println("3. ghi");
			System.out.println("4. lmn");
			n = scan.nextInt();
			if(n == 4){
				this.markGK = 10;
				System.out.println("Đúng");
				this.count += this.markGK;
				count ++;
			}
			else{
				System.out.println("Sai");
			}
		}
		
		public float getMark() {
			mark = markNangkhieu + markTiengAnh + markToan + markGK;
			if(count == 20){
				mark = markNangkhieu + markTiengAnh + markToan + markGK + 2;
			}
			else if(count == 30){
				mark = markNangkhieu + markTiengAnh + markToan + markGK + 5;
			}
			else if(count == 40){
				mark = markNangkhieu + markTiengAnh + markToan + markGK + 10;
			}
			return mark;
		}

		public void setMark(int mark) {
			this.mark = mark;
		}
		
		public void input() {
			System.out.println("Nhập ID: ");
			id = scan.nextLine();
			System.out.println("Nhập tên: ");
			name = scan.nextLine();
		}
		
		@Override
		public String toString() {
			System.out.println("Student [id= " + id + ", name= " + name + ", mark= " + getMark() + "]");
			return "Student [id= " + id + ", name= " + name + ", mark= " + mark + "]";
		}
}
