import java.util.Scanner;

public class A_1217 {
	/*
	 * ��Ŀ���� 
	 * ��һ����������ͳ�������ж�����������
	 * 
	 * ���� 
	 * ����������һЩ����������ÿ������С��2^32��������Ϊ0����Ӧ����ͳ�ơ�
	 * 
	 * ��� 
	 * �����ͳ�Ƶ�����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while(num!=0) {
			boolean flag = true;
			if(num==1) {
				sum++;
			}
			for(int i = 1;i<Math.sqrt(num);i++) {
				if(i*i*i==num) {
					flag = false;
					sum++;
				}
			}
			num = scan.nextInt();
		}
		System.out.println(sum);
	}
//	public static boolean isCube(int n) {
//		boolean flag = true;
//		if(n==1) {
//			return true;
//		}
//		for(int i = 1;i<n/3;i++) {
//			if(i*i*i==n) {
//				flag = false;
//				return true;
//			}
//		}
//		if(flag) {
//			return false;
//		}
//		return false;
//	}
}
