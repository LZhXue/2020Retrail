import java.util.Scanner;

public class ShuGen_1109 {
	/*
	 * ��Ŀ���� 
	 * ����һ�������������������������
	 * ��������ͨ����һ�����ĸ���λ�ϵ����ּ������õ�������õ�������һλ������ô���������������
	 * ����������λ�����߰�������λ�����֣���ô�ٰ���Щ���ּ���������˽�����ȥ��ֱ���õ���һλ��Ϊֹ��
	 * ���磬����24��˵����2��4��ӵõ�6������6��һλ����
	 * ���6��24���������ٱ���39����3��9�������õ�12������12����һλ������˻��ð�1��2�����������õ�3������һ��һλ�������3��39��������
	 * Ҫ��ʹ�ú��������庯��digitSum(int n)��n�ĸ�λ���ֺͣ����๦����main()������ʵ�֡� 
	 * int digitSum(int n) { //��������n�ĸ�λ����֮�� }
	 * 
	 * ����
	 * һ��int��Χ�ڵ�������n 
	 * 
	 * ��� 
	 * ���n������
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(digitSum(n)>=10) {
			n =digitSum(n);
		}
		System.out.println(digitSum(n));
	}
	public static int digitSum(int n) {
		int sum = 0;
		while(n/10!=0) {
			sum = sum+n%10;
			n = n/10;
		}
		return sum+n;
	}
}
