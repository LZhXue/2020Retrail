import java.util.Scanner;

public class A_1141 {
	/*
	 * ��Ŀ���� 
	 * ��ʮ��������nת���ɶ����ƣ����������ַ������У���������Ҫ���岢����convert()����,
	 * ��ʮ��������n��Ӧ�Ķ������������ַ�����str�С�
	 * void convert(int n, char str[]);
	 * 
	 * ���� 
	 * ����һ���Ǹ�����n��n<2^31��
	 * 
	 * ��� 
	 * ���һ��01�ַ�������n��Ӧ�Ķ�������������ǰ��0�����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char str[] = new char[32] ;
		convert(n,str);
		
	}
	public static void convert(int n, char str[]) {
		StringBuilder sb = new StringBuilder();
		while(n/2!=0) {
			sb.append(n%2);
			n = n/2;
		}
		sb.append(n%2);
		if(sb.length()==0) {
			sb.append(0);
		}
		sb.reverse();
		str = sb.toString().toCharArray();
		System.out.println(str);
	}
}
