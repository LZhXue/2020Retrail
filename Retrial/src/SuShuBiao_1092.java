import java.util.Scanner;

public class SuShuBiao_1092 {

	/**
	 * 输入两个正整数m和n，输出m和n之间的所有素数。
	 * 要求程序定义一个prime()函数和一个main()函数，prime()函数判断一个整数n是否是素数，其余功能在main()函数中实现。 
	 * int prime(int n) { //判断n是否为素数， 若n为素数，本函数返回1，否则返回0 }
	 * 输入
 	 * 输入两个正整数m和n，m<=n，且都在int范围内。
 	 * 输出
 	 * 输出占一行。输出m和n之间的所有素数，每个数后有一个空格。测试数据保证m到n之间一定有素数。
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		for (int i = m; i <= n; i++) {
			if (prime(i) == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static int prime(int n) {
		/*
		 * if ( n==1) { return 0; } 
		 * for(int i = 2;i<n;i++) { 
		 * 		if(n%i==0) { return 0; }
		 *  }
		 * return 1; 
		 */// 时间超限
		int in = 1;
		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (n % j == 0) {
				in = 0;
				break;
			}
		}
		if(n==1) {
			in = 0;
		}
		return in;
	}
}
