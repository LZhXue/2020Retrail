import java.util.Scanner;

public class A_1231 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			for(int i = 0;i<2*n+1;i++) {
				if(i%2==0) {
					mi(n);
				}else {
					xi(n);
				}
			}
			System.out.println();
		}
	}
	public static void mi(int n) {
		for(int i = 0;i<2*n+1;i++) {
			System.out.print("0");
		}
		System.out.println();
	}
	public static void xi(int n) {
		for(int i = 0;i<n*2+1;i++) {
			if(i%2==0) {
				System.out.print("0");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
