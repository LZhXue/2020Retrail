import java.util.Scanner;

public class A_1200 {
	/*
	 * ��Ŀ���� ��֪Ԫ�ش�С�������е���������x[]��y[]����д��һ�����������������˴�֮���ľ���ֵ����С��һ�������������ľ���
	 * 
	 * ���� ��һ��Ϊ��������m, n(1��m, n��1000)���ֱ��������f[], g[]�ĳ��ȡ�
	 * �ڶ�����m��Ԫ�أ�Ϊ����f[]����������n��Ԫ�أ�Ϊ����g[]��
	 * 
	 * ��� �������̾���
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
