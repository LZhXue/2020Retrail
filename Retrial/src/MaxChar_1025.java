import java.util.Scanner;

public class MaxChar_1025 {
	/*
	 * ��Ŀ���� 
	 * ��������ASCII�ַ�(�����հ��ַ�:�����ո��Ʊ��\t���س����з�\n)���ҳ����������Ǹ� 
	 * 
	 * ���� 
	 * ������������ַ���֮����һ���ո������
	 * 
	 * ��� 
	 * ���ASCII�������Ǹ��ַ���ռһ�С�
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int x = str.charAt(0);
		int y = str.charAt(2);
		int z = str.charAt(4);
		char ch =  (char)Math.max(z, Math.max(x, y));
		System.out.println(ch);
		
	}

}
