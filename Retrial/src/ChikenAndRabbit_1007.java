import java.util.Scanner;

public class ChikenAndRabbit_1007 {
	/*
	 * ��Ŀ���� 
	 * �����ù���һ�����������2ֻ�ţ�����4ֻ�ţ�û�����⡣
	 * ��֪���ڿ��Կ���������m��ͷ��nֻ�ţ��󼦺����Ӹ��ж���ֻ��
	 * 
	 * ���� 
	 * ������������m��n���ֱ����������ͷ�ĸ����ͽŵĸ�����(����m��n���ںϷ������ݷ�Χ��)
	 * 
	 * 
	 * ��� 
	 * ������������õ�ֻ����������Ϊ0��ҲҪ�����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,n;
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		System.out.print((4*m-n)/2);
		System.out.print(" ");
		System.out.println((n-2*m)/2);
	}

}
