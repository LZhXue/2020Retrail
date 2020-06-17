import java.util.Scanner;

public class A_1224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int r = 0;r<t;r++) {
			int heng = scan.nextInt();
			int shu = scan.nextInt();
			for (int i = 0; i < heng; i++) {
				huaheng(shu);
				huashu(shu);
			}
			huaheng(shu);
		}
	}

	public static void huaheng(int n) {
		System.out.print("+");
		for(int i = 0;i<n;i++) {
			System.out.print("--+");
		}
		System.out.println();
	}

	public static void huashu(int n) {
		System.out.print("|");
		for(int i = 0;i<n;i++) {
			System.out.print("  |");
		}
		System.out.println();
		System.out.print("|");
		for(int i = 0;i<n;i++) {
			System.out.print("  |");
		}
		System.out.println();
	}
}
