import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1277 {
	/*
	 * 输入 输入包含多个测试实例，每个实例的第一行是两个整数v和n(v,n<=100)，分别表示Dooler口袋的容量和宝贝的种类，
	 * 接着的n行每行包含2个整数pi和mi(0 < pi,mi < 10)，分别表示某种宝贝的价值和对应的体积，v为0的时候结束
	 * 
	 * 输出 对于每个测试实例，请输出ZY最多能取回多少价值的宝贝，每个实例的输出占一行。
	 */
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			int v = scan.nextInt();// 口袋容量
//			if (v == 0) {
//				break;
//			}
//			int n = scan.nextInt();// 宝贝种类数
//			ArrayList<Miracle> al = new ArrayList<Miracle>();
//			for (int i = 0; i < n; i++) {
//				int pi = scan.nextInt();
//				int mi = scan.nextInt();
//				al.add(new Miracle(pi,mi));
//			}
//			Collections.sort(al);
//			int sumV = 0;//总价值
//			int sumT = 0;//总体积
//			for(int i = 0;i<n;i++) {
////				System.out.println(al.get(i).rate);
//				if(sumT+al.get(i).mi<=v
//						) {
//					sumV+=al.get(i).pi;
//					sumT+= al.get(i).mi;
//				}
//			}
//			System.out.println(sumV);
//		}
//	}
//
//}
//
//class Miracle implements Comparable<Miracle> {
//	int pi;//价值
//	double mi;//体积
//	double rate;
// 
//	Miracle(int pi, double mi) {
//		this.pi = pi;
//		this.mi = mi;
//		this.rate = pi / mi;
//	}
//
//	@Override
//	public int compareTo(Miracle o) {
//		if (this.rate < o.rate) {
//			return 1;
//
//		} else if (this.rate > o.rate) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}
//}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int ma = 0;
			int m = scan.nextInt();// 口袋容量
			if (m == 0) {
				break;
			}
			int n = scan.nextInt();// 宝贝种类数
			int f[][] = new int[n+1][m+1];
			for (int i = 1; i <= n; i++) {
				int pi = scan.nextInt();
				int mi = scan.nextInt();
				for (int j = 0; j <= m; j++)
					if (j >= mi)
						f[i][j] = max(f[i - 1][j], f[i - 1][j - mi] + pi);
					else
						f[i][j] = f[i - 1][j];
			}
			ma = f[n][0];
			for (int i = 1; i <= m; i++) {
				if (ma < f[n][i])
				ma = f[n][i];}
			System.out.println(ma);
		}
	}

	

	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}