import java.util.Scanner;

public class A_1132 {

	/*
	 * ���ڸ�����һ���ַ�����ͳ�����������ַ����ֵĴ������ַ������Ȳ�����1000. 
	 * 
	 * ����
	 * ���������ж��У���һ����һ������n����ʾ����ʵ���ĸ������������n�У�ÿ�а���һ������ĸ��������ɵ��ַ����� 
	 * 
	 * ���
	 * ����ÿ������ʵ��������ô��������ַ��ĸ�����ÿ�����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			int sum = 0;
			for(int j = 0;j<str.length();j++) {
				if(Character.isDigit(str.charAt(j))) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}
