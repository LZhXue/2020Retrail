import java.util.Scanner;

public class A_1218 {
	/*
	 * ��Ŀ���� ����һ���򵥵����⣬��������������a��b��0<=a,b<=2^31����Ȼ���a��b��תȻ����ӣ����忴������
	 * 
	 * ���� ÿ����������һ������t����ʾ��t�����ݡ� �Ժ�ÿ������ռһ�У���Ϊ��������a��b��û��ǰ��0����
	 * 
	 * ��� ����ÿ������ ��������ַ�ת��Ӻ�Ľ����ÿ��ռһ�С�û��ǰ��0��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<t;i++) {
			String str[] = scan.nextLine().split(" +");
			String str1 = str[0];
			String str2 = str[1];
			System.out.println(reverseAndAdd(str1,str2));
		}
	}
	
	public static int reverseAndAdd(String str1,String str2) {
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		sb1.reverse();
		sb2.reverse();
		return Integer.valueOf(sb1.toString())+Integer.valueOf(sb2.toString());
	}
}
