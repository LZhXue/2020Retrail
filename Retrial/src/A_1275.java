import java.util.Arrays;
import java.util.Scanner;

public class A_1275 {
	/*
	 * ��Ŀ���� 
	 * ���ȸ���n������������Ȼ�����m���������ܿ���ȷ����m��������n�����г��ֹ���
	 * 
	 * ���� 
	 * ��1��������ݡ���һ����һ������n ����ΧΪ0��1000000���ڶ���n������,ÿ�������ķ�ΧΪ0��10^9
	 * ��������һ������m����ΧΪ0��1000000��������m��������ÿ�������ķ�ΧΪ0��10^9 ��
	 * 
	 * ��� 
	 * ��Ӧ�����m�����������m����Ӧ�Ľ������i���������ǰn�������г��ֹ������λ�ã��������no������m��������˳�������Ӧ�Ľ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nn[] = new int[n];
		for(int i = 0;i<n;i++) {
			nn[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		for(int i = 0;i<m;i++) {
			int temp = scan.nextInt();
			int a = Arrays.binarySearch(nn, temp);
			if(a>=0) {
				System.out.println(a+1);
			}
			else {
				System.out.println("no");
			}
		}
	}

}
