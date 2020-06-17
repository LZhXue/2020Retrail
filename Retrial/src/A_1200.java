import java.util.Scanner;

public class A_1200 {
	/*
	 * 题目描述 已知元素从小到大排列的两个数组x[]和y[]，请写出一个程序算出两个数组彼此之间差的绝对值中最小的一个，这叫做数组的距离
	 * 
	 * 输入 第一行为两个整数m, n(1≤m, n≤1000)，分别代表数组f[], g[]的长度。
	 * 第二行有m个元素，为数组f[]。第三行有n个元素，为数组g[]。
	 * 
	 * 输出 数组的最短距离
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int x[] = new int[m];
		int y[] = new int[n];
		for (int i = 0; i < m; i++) {
			x[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = scan.nextInt();
		}
		int c;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c = x[i] - y[j];
				if (c < 0)
					c = -c;
				if (c < min)
					min = c;
			}
		}
		System.out.println(min);
	}

}
