import java.util.Arrays;
import java.util.Scanner;

public class A_1122 {
	/*
	 * ��Ŀ���� С������ʦ������һ�ݵ�����ҵ��С������ѧУ�������N��ͬѧһ����һ���ʾ���飬������С��Ϊ��ʵ��Ŀ͹��ԣ�
	 * �������д����N��1��1000֮���������0<N��1000������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�����д�µ�������������ظ����֣�
	 * С��ϣ���ܰ������ظ�����ȥ����Ȼ���ٰ���Щ����С�������� �����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
	 * 
	 * ���� ������2�У���1��Ϊ1������������ʾ�����ĸ���N. ��2����N���ÿո����������������ʾС��д�µ�N��������
	 * 
	 * ��� ���Ҳ��2�У���1��Ϊ1��������M����ʾ����ͬ�������ĸ�������2��ΪM���ÿո��������������Ϊ��С�����ź���Ĳ���ͬ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.parallelSort(arr);
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] - arr[i - 1] == 0) {
				arr[i-1] = 0;
				sum++;
			}
		}
		System.out.println(n - sum);
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
			
		}

	}

}
