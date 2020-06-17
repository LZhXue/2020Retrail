import java.util.Scanner;

public class PrintNumImage_1108 {

	/*
	 * 题目描述
	 * 从键盘输入一个整数n(1≤n≤9),打印出指定的数字图形。要求在程序中定义并调用如下函数：
	 * PrintSpace(m)用来输出m个空格；
	 * PrintDigit(m)来输出一行中的数字串"12...m...21"（该行中的最大数字是m）。
	 * 函数原型如下： 
	 * void PrintDigit(int m); 
	 * void PrintSpace(int m);
	 * 
	 * 输入
	 * 正整数n（1≤n≤9）。 
	 * 
	 * 输出 
	 * 指定数字图形。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt()-1;
		for(int i = 0;i<n;i++) {
			PrintSpace(n-i);
			PrintDigit(i);
			System.out.println();
		}
		for(int i = 0;i<=n;i++) {
			PrintSpace(i);
			PrintDigit(n-i);
			System.out.println();
		}
	}
	
	public static void PrintDigit(int m) {
		int i =1;
		while(i<=m) {
			System.out.print(i);
			i++;
		}
		while(i>=1) {
			System.out.print(i);
			i--;
		}
	}
	public static void PrintSpace(int m) {
		for(int i = 0;i<m;i++) {
			System.out.print(" ");
		}
	}

}
