import java.util.Scanner;

public class NiXuShuZi_1101 {

	/*
	 * ����һ��������n������n��������m�����m��n�ĺ͡�
	 * inverse()��������һ������ֵ,��������������������Ľ��ֵ������,������7631,��������1367 �� 
	 * int inverse(int n) { //���㲢����n���������� } 
	 * 
	 * ����
	 * һ��������n�����뱣֤��������int��Χ�ڡ� 
	 * 
	 * ��� 
	 * ���һ��������n��n���������ĺ͡����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n+inverse(n));
	}
	public static int inverse(int n) {
		String str = String.valueOf(n);
		double sum = 0;
		for(int i = 0;i<str.length();i++) {
			sum = sum+Math.pow(10, i)*(Integer.valueOf(str.charAt(i))-48);
		}
		int summ = (int)Math.floor(sum);
		return summ;
	}
}
