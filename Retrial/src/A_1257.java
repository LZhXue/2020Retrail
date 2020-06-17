import java.util.Arrays;
import java.util.Scanner;

public class A_1257 {
	/*
	 * ���� �����ж���������ݡ� ÿ��������ݰ���3�У� ��һ������N(1��N��1000)����ʾ��������� �ڶ�����N���������֣���Ԩ�ӵ�Nƥ����ٶȡ�
	 * ��������N���������֣������ֵ�Nƥ����ٶȡ� ��NΪ0ʱ�˳���
	 * 
	 * ��� ��ͨ���������㾫�İ��ţ����Ԩ����Ӯ�ñ�������ô�����YES���� ���������NO����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			int yuanzi[] = new int[n];
			int duishou[] = new int[n];
			for (int i = 0; i < n; i++) {
				yuanzi[i] = scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				duishou[i] = scan.nextInt();
			}
			Arrays.parallelSort(yuanzi);
			Arrays.parallelSort(duishou);
			int indexyuan = 0;
			int indexdui = 0;
			int sum = 0;
			while (indexyuan < n && indexdui < n) {
				if (yuanzi[indexyuan] > duishou[indexdui]) {
					sum++;
					indexyuan++;
					indexdui++;
				} else {
					indexyuan++;
				}
			}
			if (sum > n / 2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			n = scan.nextInt();
		}
	}

}
