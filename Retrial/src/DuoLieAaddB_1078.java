import java.util.Scanner;

public class DuoLieAaddB_1078 {

	/*
	 * ����A+B 
	 * ���� 
	 * �����1��Ϊһ������n(1��n��10)��������Ե������� 
	 * ������n��������ݣ�ÿ��1�У�Ϊ2��������ΪA, B�� 
	 * 
	 * ���
	 * ��ÿ�����룬���A+B��ֵ������ռһ�С�
	 */	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 for(int i = 0;i<n;i++) {
			 int a = scan.nextInt();
			 int b = scan.nextInt();
			 System.out.println(a+b);
		 }
	}

}
