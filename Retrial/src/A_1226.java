import java.util.Scanner;

public class A_1226 {
	/*
	 * ��Ŀ���� ��֪������������f[]��g[]�����ǵ�Ԫ�ض��Ѿ���С�������С�����f[]�п�����1��2��2��3��3��g[]����1��2��2��2��3��
	 * ��дһ�������������������˴�֮���ж�������ͬ�����ݡ� ������������: f[0]��g[0]�ǵ�һ�飻
	 * f[1]��g[1]�ǵڶ��飻f[2]��g[2]�ǵ����飻 f[3]��g[4]�ǵ����顣
	 * 
	 * ���� ��һ��Ϊ��������m, n(1��m, n��1000)���ֱ��������f[], g[]�ĳ��ȡ�
	 * �ڶ�����m��Ԫ�أ�Ϊ����f[]����������n��Ԫ�أ�Ϊ����g[]��
	 * 
	 * ��� �����ֵ��Ŀ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int f[] = new int[m];
		int g[] = new int[n];
		for(int i = 0;i<m;i++) {
			f[i] = scan.nextInt();
		}
		for(int i = 0;i<n;i++) {
			g[i] = scan.nextInt();
		}
		System.out.println(sumEqual(f,g));
	}

	public static int sumEqual(int f[], int g[]) {
		int lenf = f.length;
		int leng = g.length;
		int indexf = 0;
		int indexg = 0;
		int sum = 0;
		while (indexf < lenf && indexg < leng) {
			if (f[indexf] == g[indexg]) {//��ȵ������������1��f��g��������һ��Ԫ�رȽ�
				sum++;
				indexf++;
				indexg++;
			} else if (f[indexf] < g[indexg])//fС������һ��f
				indexf++;
			else//f�󣬿���һ��g
				indexg++;
		}
		return sum;
	}
}
