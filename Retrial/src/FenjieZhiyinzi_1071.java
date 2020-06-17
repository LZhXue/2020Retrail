import java.util.Scanner;

public class FenjieZhiyinzi_1071 {

	/*
	 * 题目描述 将一个正整数分解质因数，例如，输入90，输出2 3 3 5。
	 * 
	 * 输入 输入一个正整数n（2<=n<=2000）。
	 * 
	 * 输出 从小到大输出n的所有质因子，每两个数之间空一格。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 1) {
			for (int i = 2; i <= n; i++) {
				if (isSuShu(i) && n % i == 0) {
					n = n/i;
					System.out.print(i + " ");
					break;
				}
			}
		}
	}

	public static boolean isSuShu(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
