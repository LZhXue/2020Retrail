import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1277 {
	/*
	 * ���� ��������������ʵ����ÿ��ʵ���ĵ�һ������������v��n(v,n<=100)���ֱ��ʾDooler�ڴ��������ͱ��������࣬
	 * ���ŵ�n��ÿ�а���2������pi��mi(0 < pi,mi < 10)���ֱ��ʾĳ�ֱ����ļ�ֵ�Ͷ�Ӧ�������vΪ0��ʱ�����
	 * 
	 * ��� ����ÿ������ʵ���������ZY�����ȡ�ض��ټ�ֵ�ı�����ÿ��ʵ�������ռһ�С�
	 */
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			int v = scan.nextInt();// �ڴ�����
//			if (v == 0) {
//				break;
//			}
//			int n = scan.nextInt();// ����������
//			ArrayList<Miracle> al = new ArrayList<Miracle>();
//			for (int i = 0; i < n; i++) {
//				int pi = scan.nextInt();
//				int mi = scan.nextInt();
//				al.add(new Miracle(pi,mi));
//			}
//			Collections.sort(al);
//			int sumV = 0;//�ܼ�ֵ
//			int sumT = 0;//�����
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
//	int pi;//��ֵ
//	double mi;//���
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
			int m = scan.nextInt();// �ڴ�����
			if (m == 0) {
				break;
			}
			int n = scan.nextInt();// ����������
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