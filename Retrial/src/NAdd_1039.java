import java.util.Scanner;

public class NAdd_1039 {

	/*
	 * ��Ŀ���� 
	 * ����һ������n��n�������������n�������ĺ͡� 
	 * 
	 * ���� 
	 * ���������У���һ����һ��������n���ڶ�����n�������� 
	 * 
	 * ���
	 * ���һ����������n�����ĺ͡��������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum = sum + scan.nextInt();
		}
		System.out.println(sum);
	}

}
