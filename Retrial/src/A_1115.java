import java.util.Scanner;

public class A_1115 {
	/*
	 * ��Ŀ���� 
	 * ����a��n��Ԫ�أ������n��Ԫ�ص���Сֵ�����±ꡣ����Сֵ�ж����������±���С��һ����ע�⣬��Ч�±��0��ʼ�� 
	 * 
	 * ����
	 * ��������У���һ����һ��������n��n<=1000)���ڶ�����n�������� 
	 * 
	 * ��� 
	 * ���ռһ�С�����������Сֵ�����±꣬�ÿո������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int j = 0;
		int small = scan.nextInt();
		for(int i = 1;i<n;i++) {
			int s = scan.nextInt();
			if(small>s) {
				small = s;
				j = i;
			}
		}
		System.out.println(small+" "+j);

	}

}
