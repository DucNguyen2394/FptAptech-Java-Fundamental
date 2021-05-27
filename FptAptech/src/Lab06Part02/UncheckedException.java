package Lab06Part02;

public class UncheckedException {
	public UncheckedException () {
		
	}
	
	public static void main(String[] args) {
		try{
			
			int i, n = 2;
			int a[] = new int[n];
			java.util.Scanner input = new java.util.Scanner(System.in);
			for(i = 0 ; i <= n ; i++)
			{
				System.out.println();
				a[i] = input.nextInt();
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("invalid");
		}
	}
}

