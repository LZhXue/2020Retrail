import java.util.Scanner;

public class IsSuShu_1057 {
	/*
	 * ��Ŀ���� ����һ��������n���ж�n�Ƿ�����������n�������������Yes��,���������No����
	 * 
	 * ���� ����һ��������n(n<=1000)
	 * 
	 * ��� ���n���������"Yes"���������"No"�����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		if (n == 1) {
			System.out.println("No");
			flag = 1;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println("No");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Yes");
		}
	}

}
