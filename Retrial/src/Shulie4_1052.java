import java.util.Scanner;

public class Shulie4_1052 {
	/*
	 * ����n��a����a+aa+aaa+��aa��a(n��a)��
	 * �統n=3,a=2ʱ��2+22+222�Ľ��Ϊ246 
	 * 
	 * ����
	 * ��������������n��a,����������������Լٶ�n��a����С��10�ķǸ����� 
	 * 
	 * ��� 
	 * ���ǰn��ͣ�����ռһ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = scan.nextInt();
		int a =scan.nextInt();
		int b = a;
		for(int i = 0;i<n;i++) {
			sum = sum+a;
			a = b+10*a;
		}
		System.out.println(sum);
	}

}
