import java.util.Scanner;

public class A_1111 {

	/*
	 * ��Ŀ���� 
	 * ����n��n����������������˳���෴��˳�������n��������Ҫ��ʹ�����飬��ʹ�õݹ麯��ʵ�֡� 
	 * �ݹ麯��ʵ�ֹ������£� 
	 * void inverse(int n) { 
	 * if(n >1) { 
	 * (1) ����һ������������num; 
	 * (2) �������n-1�����������:inverse(n-1); 
	 * (3) ���num�� } 
	 * if( n == 1) ֱ�����num�� } 
	 * 
	 * ����
	 * ���������У���һ����һ��������n���ڶ�����n������������֮���ɿո������ 
	 * ��� ���n��������˳��������˳���෴��ÿ����������һ���ո�
	 */
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scan.nextInt();
		scan.nextLine();
		inverse(n);
	}
	public static void inverse(int n) {
		int num;
		if(n==1) {
			num = scan.nextInt();
			System.out.print(num+" ");
		}
		if(n>1) {
			num = scan.nextInt();
			inverse(n-1);
			System.out.print(num+" ");
		}
	}
}
