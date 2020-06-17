import java.util.Scanner;

public class HuiWenShuCaiXiang_1107 {

	/*
	 * 题目描述 一个正整数，如果从左向右读（称之为正序数）和从右向左读（称之为倒序数）是一样的，这样的数就叫回文数。
	 * 任取一个正整数，如果不是回文数，将该数与他的倒序数相加 ，若其和不是回文数，则重复上述步骤，一直到获得回文数为止。
	 * 于是有数学家提出一个猜想：不论开始是什么正整数，在经过有限次正序数和倒序数相加的步骤后，都会得到一个回文数。
	 * 至今为止还不知道这个猜想是对还是错。现在请你编程序验证之。你已经会写求一个整数的逆序数的函数inverse()，
	 * 那么如下循环可以模拟回文数猜想的验证过程： while( m = inverse(n), m != n) { 输出n; 把n更新为 m + n; }
	 * 
	 * 输入 输入一个正整数。特别说明：输入的数据保证中间结果小于2^31。
	 * 
	 * 输出 输出占一行，变换的过程中得到的数值，两个数之间用空格隔开。
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (true) {
			int m = inverse(n);
			if (m != n) {
				System.out.print(n + " ");
				n = m + n;
			}else {
				System.out.print(n + " ");
				break;
			}
		}
	}

	public static int inverse(int n) {
		int s = 0;
		while (n != 0) {
			s = s * 10 + n % 10;
			n = n / 10;
		}
		return (s);
	}
}
