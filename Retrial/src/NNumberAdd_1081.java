import java.util.Scanner;

public class NNumberAdd_1081 {

	/*
	 * ��Ŀ���� 
	 * ��n�������ĺ͡� 
	 * 
	 * ���� 
	 * �����һ����һ������T����ʾ��T�����ʵ���� ÿ������������У� ��һ��һ����n��ʾ����������n��������
	 * �ڶ��пո������n������ 
	 * 
	 * ��� 
	 * ����ÿ�����룬��һ�����n�����ĺͣ���֤�Ͳ��ᳬ��int���͵ķ�Χ����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0;i<t;i++) {
			int n = scan.nextInt();
			int sum = 0;
			for(int j = 0;j<n;j++) {
				sum = sum+scan.nextInt();
				if(j==n-1) {
					System.out.println(sum);
				}
			}
		}
	}

}
