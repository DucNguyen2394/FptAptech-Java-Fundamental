package Lab06Part03;

import java.util.Scanner;

public class Triangle {
	public int a,b,c;
	
	public Triangle(){
		
	}	
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	public void DTTG(){
		Scanner scan = new Scanner(System.in);
		int d,j = 0;
		while(j < 5){
		try{
			for(int i = 0; i < 5; i++){
				System.out.printf("Tam giac thu %d \n", i+1);
				System.out.println("a : ");
				a = scan.nextInt();
				System.out.println("b : ");
				b = scan.nextInt();
				System.out.println("c : ");
				c = scan.nextInt();		
				j++;
				if(a < b + c && b < a + c && c < a + b){
					d = a * b * c;
					System.out.println("Tam giac co dien tich la: " + d);	
				}
				else{
					throw new InvalidTriangleException("invalid");
				}
			}
		}catch(InvalidTriangleException e){
			System.out.print("day ko phai la tam giac");
		}
		}
	}
}
