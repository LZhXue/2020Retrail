import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A_1201 {
	/*
	 * ��Ŀ���� 
	 * ��������n��Ԫ�صĶ��ؼ���S��ÿ��Ԫ����S�г��ֵĴ�����Ϊ��Ԫ�ص����������ؼ�S����������Ԫ�س�Ϊ������
	 * ���磬S={1��2��2��2��3��5}�����ؼ�S��������2��������Ϊ3�� ������� ���ڸ�������n ����Ȼ����ɵĶ��ؼ�S����̼���S ����������������
	 * 
	 * ���� 
	 * ��1�ж��ؼ�S��Ԫ�ظ���n(n<=50000)����������n ���У�ÿ����һ����Ȼ���� 
	 * 
	 * ��� 
	 * ����ļ���2 �У���1 �и�����������2����������(����ж��������ֻ�����С��)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.parallelSort(arr);
		int maxchong=0;
		int record = 0;
		int chongnum=1;
		for(int i = 1;i<n;i++) {
			if(arr[i] == arr[i-1]) {
				chongnum++;
			}else {
				chongnum=1;
			}
			if(maxchong<chongnum) {
				maxchong=chongnum;
				record = arr[i];
			}
		}
		System.out.println(record);
		System.out.println(maxchong);
	}

}

