import java.util.Scanner;

public class A_1227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n!=0) {
			for(int i = 0;i<n/2+1;i++) {//上部分
				for(int j = 0;j<n;j++) {
					if(j>=n/2-i&&j<=n/2+i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			for(int i = n/2+2;i<n+1;i++) {//下部分
				for(int j = 0;j<n;j++) {
					if( n/2-(n-i)<=j && j<=n/2+(n-i)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			n = scan.nextInt();
		}
	}

}
