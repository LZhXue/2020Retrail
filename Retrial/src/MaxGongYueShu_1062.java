import java.util.Scanner;

public class MaxGongYueShu_1062 {

	/*
	 * 题目描述 输入两个不大于10的9次方的正整数，输出其最大公约数。
	 * 
	 * 输入 输入两个正整数m和n，数据之间用空格隔开。
	 * 
	 * 输出 输出一个整数，表示m和n的最大公约数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int result;
//		for (int i = Math.min(m, n); i > 0; i--) {
//			if (m % i == 0 && n % i == 0) {
//				System.out.println(i);
//				break;
//			}
//		}    //此方法时间超限，改用辗转相除法实现
//		使用辗转相除法，又名欧几里德算法（Euclidean algorithm），是求最大公约数的一种方法。
//		它的具体做法是：用较大数除以较小数，再用出现的余数（第一余数）去除除数，再用出现的余数（第二余数）去除第一余数，如此反复，直到最后余数是0为止。如果是求两个数的最大公约数，那么最后的除数就是这两个数的最大公约数。

		if (m >= n) {// 辗转相除法
			while (m % n != 0) {
				int c = m % n;
				m = n;
				n = c;
			}
			result = n;
		} else {
			while (n % m != 0) {
				int c = n % m;
				n = m;
				m = c;
			}
			result = m;
		}
		System.out.println(result);
	}
}