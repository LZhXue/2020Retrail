import java.util.Scanner;

public class A_1222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int kuan = scan.nextInt();
			int chang = scan.nextInt();
			System.out.print("+");
			for(int i = 0;i<kuan;i++) {
				System.out.print("-");
			}
			System.out.print("+");
			System.out.println();
			for(int i = 0;i<chang;i++) {
				System.out.print("|");
				for(int j = 0;j<kuan;j++) {
					System.out.print(" ");
				}
				System.out.print("|");
				System.out.println();
			}
			System.out.print("+");
			for(int i = 0;i<kuan;i++) {
				System.out.print("-");
			}
			System.out.print("+");
			System.out.println();
			System.out.println();
		}
	}

}
